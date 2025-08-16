package org.marsrover.gridentity.vehicle;

import org.marsrover.Position;
import org.marsrover.direction.Direction;

public class Buggy extends AbstractVehicle {

    public Buggy(Position position, Direction direction) {
        super(position, direction);
    }

    @Override
    public char getLabel() {
        return 'B';
    }

    @Override
    public int getStepSize() {
        return 1;
    }
}
