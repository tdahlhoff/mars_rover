package org.marsrover.gridentity;

import org.marsrover.Grid;
import org.marsrover.Position;

public abstract class AbstractGridEntity implements GridEntity {

    private Position position;
    private Grid grid;

    public AbstractGridEntity(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @Override
    public Grid getGrid() {
        return grid;
    }

    protected void setPosition(Position position) {
        this.position = position;
    }
}
