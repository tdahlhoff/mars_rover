package org.marsrover.exception;

import org.marsrover.Grid;
import org.marsrover.Position;

public class PositionOutOfBoundsException extends GridPositionException {
    public PositionOutOfBoundsException(Grid grid, Position position) {
        super("The position is out of bounds of the plateau!", grid, position);
    }
}
