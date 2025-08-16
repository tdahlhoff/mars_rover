package org.marsrover.exception;

import org.marsrover.Grid;
import org.marsrover.Position;

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
