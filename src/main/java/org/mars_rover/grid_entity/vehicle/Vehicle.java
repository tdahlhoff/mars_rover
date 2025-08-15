package org.mars_rover.grid_entity.vehicle;

import org.mars_rover.direction.Direction;

public interface Vehicle {
    Direction getDirection();
    int getStepSize();
}
