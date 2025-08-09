package org.mars_rover.direction;

public class West extends AbstractDirection {

    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }

    @Override
    public DirectionEnum getDirection() {
        return DirectionEnum.WEST;
    }
}
