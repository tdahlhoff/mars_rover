package org.marsrover;

import org.marsrover.exception.PositionOccupiedException;
import org.marsrover.exception.PositionOutOfBoundsException;
import org.marsrover.gridentity.GridEntity;

import java.util.LinkedList;
import java.util.List;

public class Grid {

    public int getDimensionX() {
        return dimensionX;
    }

    public int getDimensionY() {
        return dimensionY;
    }

    public List<GridEntity> getGridEntities() {
        return gridEntities;
    }

    private final int dimensionX;
    private final int dimensionY;
    List<GridEntity> gridEntities = new LinkedList<>();

    public Grid(int dimensionX, int dimensionY) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    public void placeGridEntity(GridEntity gridEntity) {
        ensurePositionInsideBounds(gridEntity.getPosition());
        ensurePositionIsFree(gridEntity.getPosition());
        gridEntity.setGrid(this);
        gridEntities.add(gridEntity);
    }

    public void ensurePositionInsideBounds(Position position) {
        if(position.x < 0 || position.x >= dimensionX || position.y < 0 || position.y >= dimensionY) {
            throw new PositionOutOfBoundsException(this, position);
        }
    }

    public void ensurePositionIsFree(Position position) {
        if (gridEntities.stream().anyMatch(gridEntity -> gridEntity.getPosition().equals(position))) {
            throw new PositionOccupiedException(this, position);
        }
    }
}
