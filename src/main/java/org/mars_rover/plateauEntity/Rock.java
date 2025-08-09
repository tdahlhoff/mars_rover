package org.mars_rover.plateauEntity;

import org.mars_rover.Position;

public class Rock implements PlateauEntity {

    private final Position position;

    public Rock(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public char getLabel() {
        return '▲';
    }
}
