package org.mars_rover.direction;

public class North extends AbstractDirection {

    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public DirectionEnum getDirection() {
        return DirectionEnum.NORTH;
    }
}
