package org.mars_rover.exception;

import org.mars_rover.Grid;
import org.mars_rover.Position;

public class PositionOccupiedException extends GridPositionException {
    public PositionOccupiedException(Grid grid, Position position) {
        super("The position is already occupied!", grid, position);
    }
}
