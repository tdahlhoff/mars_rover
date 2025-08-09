package org.mars_rover.exception;

import org.mars_rover.Plateau;
import org.mars_rover.Position;

public class PlateauPositionException extends RuntimeException {
    private final Plateau plateau;
    private final Position position;

    public PlateauPositionException(String message, Plateau plateau, Position position) {
        super(message);
        this.plateau = plateau;
        this.position = position;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public Position getPosition() {
        return position;
    }
}
