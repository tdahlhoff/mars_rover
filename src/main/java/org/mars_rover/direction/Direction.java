package org.mars_rover.direction;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    DirectionEnum getDirection();
}
