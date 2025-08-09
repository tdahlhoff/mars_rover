package org.mars_rover.plateauEntity.vehicle;

import org.mars_rover.Position;
import org.mars_rover.direction.Direction;

public class Rover extends AbstractVehicle {

    public Rover(Position position, Direction direction) {
        super(position, direction);
    }

    @Override
    public char getLabel() {
        return 'R';
    }

    @Override
    public int getStepSize() {
        return 1;
    }
}
