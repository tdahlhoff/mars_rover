package org.mars_rover.grid_entity.vehicle;

import org.mars_rover.Position;
import org.mars_rover.command.VehicleCommand;
import org.mars_rover.direction.Direction;
import org.mars_rover.exception.GridPositionException;
import org.mars_rover.grid_entity.AbstractGridEntity;

import java.util.List;

public abstract class AbstractVehicle extends AbstractGridEntity implements Vehicle {
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

    public void moveForward(int steps) {
        int distance = steps * getStepSize();
        Position newPosition;
        switch (direction.getDirectionEnum()) {
            case NORTH -> newPosition = new Position(position.x, position.y-distance);
            case EAST -> newPosition = new Position(position.x+distance, position.y);
            case SOUTH -> newPosition = new Position(position.x, position.y+distance);
            case WEST -> newPosition = new Position(position.x-distance, position.y);
            default -> throw new IllegalStateException("Unexpected value: " + direction.getDirectionEnum());
        }
        getGrid().ensurePositionInsideBounds(newPosition);
        getGrid().ensurePositionIsFree(newPosition);
        position = newPosition;
    }

    public void executeCommands(List<VehicleCommand> commands) {
        try {
            commands.forEach(command -> command.execute(this));
        } catch (GridPositionException e) {
            // noop
        }
    }
}
