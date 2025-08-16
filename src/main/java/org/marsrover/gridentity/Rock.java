package org.marsrover.gridentity;

import org.marsrover.Position;

public class Rock extends AbstractGridEntity {

    public Rock(Position position) {
        super(position);
    }

    @Override
    public char getLabel() {
        return '▲';
    }
}
