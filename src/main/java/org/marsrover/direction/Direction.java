package org.marsrover.direction;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    DirectionEnum getDirectionEnum();
}
