package org.mars_rover.exception;

import org.mars_rover.Plateau;
import org.mars_rover.Position;

public class PositionOutOfBoundsException extends PlateauPositionException {
    public PositionOutOfBoundsException(Plateau plateau, Position position) {
        super("The position is out of bounds of the plateau!", plateau, position);
    }
}
