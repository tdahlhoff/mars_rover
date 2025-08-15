package org.mars_rover.pathing;

import org.mars_rover.Grid;
import org.mars_rover.Position;
import org.mars_rover.exception.PositionOccupiedException;
import org.mars_rover.exception.PositionOutOfBoundsException;

import java.util.*;

public class PathFinder {
    private final PriorityQueue<Field> open = new PriorityQueue<>();
    private final Set<Position> closed = new HashSet<>();
    private final Map<Position, Field> openMap = new HashMap<>();

    private final Position start;
    private final Position end;
    private final Grid grid;

    public PathFinder(Position start, Position end, Grid grid) {
        this.start = start;
        this.end = end;
        this.grid = grid;
    }

    public List<Position> findPath(int stepSize) {
        Field startField = new Field(start, 0, end);
        open.add(startField);
        openMap.put(start, startField);

        Field currentField;
        while (!open.isEmpty()) {
            currentField = open.poll();
            openMap.remove(currentField.getPosition());
            closed.add(currentField.getPosition());

            System.out.println("Aktuell bester Knoten: " + currentField.getPosition().x + ", " +
                    currentField.getPosition().y + " mit fCost: " + currentField.getFCost());

            if (currentField.getPosition().equals(end)) {
                return reconstructPath(currentField);
            }

            for (Position neighborPosition : getOrthogonalNeighbors(currentField.getPosition())) {

                if (closed.contains(neighborPosition)) {
                    continue;
                }

                if (!isTraversable(neighborPosition)) {
                    continue;
                }

                int newGCost = currentField.getGCost() + stepSize;

                Field existingNeighborField = openMap.get(neighborPosition);

                if (existingNeighborField == null || newGCost < existingNeighborField.getGCost()) {
                    Field neighborField;
                    if (existingNeighborField == null) {
                        neighborField = new Field(neighborPosition, newGCost, end);
                    } else {
                        neighborField = existingNeighborField;
                        neighborField.setGCost(newGCost);
                        neighborField.updateFCost();
                        open.remove(neighborField);
                    }

                    neighborField.setParent(currentField);
                    open.add(neighborField);
                    openMap.put(neighborPosition, neighborField);
                }
            }
        }

        return Collections.emptyList();
    }

    private boolean isTraversable(Position position) {
        try {
            grid.ensurePositionInsideBounds(position);
            grid.ensurePositionIsFree(position);
            return true;
        } catch (PositionOutOfBoundsException | PositionOccupiedException e) {
            return false;
        }
    }

    private List<Position> reconstructPath(Field field) {
        List<Position> path = new ArrayList<>();
        Field current = field;
        while (current != null) {
            path.add(current.getPosition());
            current = current.getParent();
        }
        Collections.reverse(path);
        return path;
    }

    private List<Position> getOrthogonalNeighbors(Position position) {
        return Arrays.asList(
                new Position(position.x, position.y + 1),
                new Position(position.x, position.y - 1),
                new Position(position.x + 1, position.y),
                new Position(position.x - 1, position.y)
        );
    }
}