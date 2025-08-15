package org.mars_rover.exception;

import org.mars_rover.Grid;
import org.mars_rover.Position;

public class PositionOutOfBoundsException extends GridPositionException {
    public PositionOutOfBoundsException(Grid grid, Position position) {
        super("The position is out of bounds of the plateau!", grid, position);
    }
}
