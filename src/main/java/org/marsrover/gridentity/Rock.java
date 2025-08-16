package org.marsrover.gridentity;

import org.marsrover.Position;

public class Rock extends AbstractGridEntity {

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
