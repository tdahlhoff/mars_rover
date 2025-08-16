package org.marsrover.gridentity.vehicle;

import org.marsrover.direction.Direction;

public interface Vehicle {
    Direction getDirection();
    int getStepSize();
}
