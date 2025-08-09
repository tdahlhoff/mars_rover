package org.mars_rover.exception;

import org.mars_rover.Plateau;
import org.mars_rover.Position;

public class PositionOccupiedException extends PlateauPositionException {
    public PositionOccupiedException(Plateau plateau, Position position) {
        super("The position is already occupied!", plateau, position);
    }
}
