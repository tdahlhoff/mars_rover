package org.marsrover.gridentity.vehicle;

import org.marsrover.Position;
import org.marsrover.command.VehicleCommand;
import org.marsrover.direction.Direction;
import org.marsrover.exception.GridPositionException;
import org.marsrover.gridentity.AbstractGridEntity;

import java.util.List;

public abstract class AbstractVehicle extends AbstractGridEntity implements Vehicle {

    private Direction direction;

    public AbstractVehicle(Position position, Direction direction) {
        super(position);
        this.direction = direction;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void turnRight() {
        direction = direction.turnRight();
    }

    @Override
    public void turnLeft() {
        direction = direction.turnLeft();
    }

    @Override
    public void moveForward(int steps) {
        int distance = steps * getStepSize();
        Position newPosition;
        switch (direction.getDirectionEnum()) {
            case NORTH -> newPosition = new Position(getPosition().x, getPosition().y-distance);
            case EAST -> newPosition = new Position(getPosition().x+distance, getPosition().y);
            case SOUTH -> newPosition = new Position(getPosition().x, getPosition().y+distance);
            case WEST -> newPosition = new Position(getPosition().x-distance, getPosition().y);
            default -> throw new IllegalStateException("Unexpected value: " + direction.getDirectionEnum());
        }
        getGrid().ensurePositionInsideBounds(newPosition);
        getGrid().ensurePositionIsFree(newPosition);
        setPosition(newPosition);
    }

    public void executeCommands(List<VehicleCommand> commands) {
        try {
            commands.forEach(command -> command.execute(this));
        } catch (GridPositionException e) {
            // noop
        }
    }
}
