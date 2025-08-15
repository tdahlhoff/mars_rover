package org.mars_rover.grid_entity.vehicle;

import org.mars_rover.Position;
import org.mars_rover.direction.Direction;

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
