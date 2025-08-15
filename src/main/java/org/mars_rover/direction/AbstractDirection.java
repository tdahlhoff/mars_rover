package org.mars_rover.direction;

public abstract class AbstractDirection implements Direction {

    @Override
    public String toString() {
        return this.getDirectionEnum().getCode();
    }
}
