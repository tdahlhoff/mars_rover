package org.marsrover.exception;

import org.marsrover.Grid;
import org.marsrover.Position;

public class PositionOccupiedException extends GridPositionException {
    public PositionOccupiedException(Grid grid, Position position) {
        super("The position is already occupied!", grid, position);
    }
}
