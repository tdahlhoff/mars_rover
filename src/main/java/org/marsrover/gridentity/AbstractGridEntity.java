package org.marsrover.gridentity;

import org.marsrover.Grid;

public abstract class AbstractGridEntity implements GridEntity {
    private Grid grid;

    @Override
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @Override
    public Grid getGrid() {
        return grid;
    }
}
