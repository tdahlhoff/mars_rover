package org.marsrover.direction;

public abstract class AbstractDirection implements Direction {

    @Override
    public String toString() {
        return this.getDirectionEnum().getCode();
    }
}
