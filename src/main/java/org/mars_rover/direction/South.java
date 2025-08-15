package org.mars_rover.direction;

public class South extends AbstractDirection {

    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public DirectionEnum getDirectionEnum() {
        return DirectionEnum.SOUTH;
    }
}
