package org.mars_rover.exception;

import org.mars_rover.Grid;
import org.mars_rover.Position;

public class GridPositionException extends RuntimeException {
    private final Grid grid;
    private final Position position;

    public GridPositionException(String message, Grid grid, Position position) {
        super(message);
        this.grid = grid;
        this.position = position;
    }

    public Grid getGrid() {
        return grid;
    }

    public Position getPosition() {
        return position;
    }
}
