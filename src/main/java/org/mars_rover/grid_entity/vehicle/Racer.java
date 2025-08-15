package org.mars_rover.grid_entity.vehicle;

import org.mars_rover.Position;
import org.mars_rover.direction.Direction;

public class Racer extends AbstractVehicle {

    public Racer(Position position, Direction direction) {
        super(position, direction);
    }

    @Override
    public char getLabel() {
        return 'R';
    }

    @Override
    public int getStepSize() {
        return 2;
    }
}
