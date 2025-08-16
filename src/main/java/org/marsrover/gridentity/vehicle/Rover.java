package org.marsrover.gridentity.vehicle;

import org.marsrover.Position;
import org.marsrover.direction.Direction;

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
