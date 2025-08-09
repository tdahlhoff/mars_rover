package org.mars_rover;

import org.mars_rover.exception.PositionOccupiedException;
import org.mars_rover.exception.PositionOutOfBoundsException;
import org.mars_rover.plateauEntity.PlateauEntity;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private final int dimensionX;
    private final int dimensionY;
    List<PlateauEntity> plateauEntities = new ArrayList<>();

    public Plateau(int dimensionX, int dimensionY) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    public void placePlateauEntity(PlateauEntity plateauEntity) {
        ensurePositionIsInPlateau(plateauEntity.getPosition());
        ensurePositionIsFree(plateauEntity.getPosition());
        plateauEntities.add(plateauEntity);
    }

    public void ensurePositionIsInPlateau(Position position) {
        if(position.x < 0 || position.x >= dimensionX || position.y < 0 || position.y >= dimensionY) {
            throw new PositionOutOfBoundsException(this, position);
        }
    }

    public void ensurePositionIsFree(Position position) {
        if (plateauEntities.stream().anyMatch(plateauEntity -> plateauEntity.getPosition().equals(position))) {
            throw new PositionOccupiedException(this, position);
        }
    }

    public void printPlateau() {
        char[][] plateau = new char[dimensionY][dimensionX];

        for (int row = 0; row < dimensionY; row++) {
            for (int col = 0; col < dimensionX; col++) {
                plateau[row][col] = '·';
            }
        }

        for (PlateauEntity plateauEntity : plateauEntities) {
            plateau[plateauEntity.getPosition().y][plateauEntity.getPosition().x] = plateauEntity.getLabel();
        }

        for (char[] row : plateau) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }

        System.out.println();
    }
}
