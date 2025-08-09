package org.mars_rover.plateauEntity.vehicle;

import org.mars_rover.direction.Direction;

public interface Vehicle {
    Direction getDirection();
    int getStepSize();
}
