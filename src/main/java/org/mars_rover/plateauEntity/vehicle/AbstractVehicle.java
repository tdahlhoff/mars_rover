package org.mars_rover.plateauEntity.vehicle;

import org.mars_rover.Plateau;
import org.mars_rover.Position;
import org.mars_rover.direction.Direction;
import org.mars_rover.plateauEntity.PlateauEntity;

public abstract class AbstractVehicle implements Vehicle, PlateauEntity {
    private Position position;
    private Direction direction;

    public AbstractVehicle(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void moveForward(Plateau plateau, int steps) {
        int distance = steps * getStepSize();
        Position newPosition;
        switch (direction.getDirection()) {
            case NORTH -> newPosition = new Position(position.x, position.y-distance);
            case EAST -> newPosition = new Position(position.x+distance, position.y);
            case SOUTH -> newPosition = new Position(position.x, position.y+distance);
            case WEST -> newPosition = new Position(position.x-distance, position.y);
            default -> throw new IllegalStateException("Unexpected value: " + direction.getDirection());
        }
        plateau.ensurePositionIsInPlateau(newPosition);
        plateau.ensurePositionIsFree(newPosition);
        position = newPosition;
    }
}
