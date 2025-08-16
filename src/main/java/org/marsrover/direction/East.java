package org.marsrover.direction;

public class East extends AbstractDirection {

    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public DirectionEnum getDirectionEnum() {
        return DirectionEnum.EAST;
    }
}
