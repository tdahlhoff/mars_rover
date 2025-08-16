package org.marsrover.gridentity.vehicle;

import org.marsrover.direction.Direction;
import org.marsrover.gridentity.GridEntity;

public interface Vehicle extends GridEntity {
    Direction getDirection();
    int getStepSize();
    void moveForward(int stepSize);
    void turnLeft();
    void turnRight();
}
