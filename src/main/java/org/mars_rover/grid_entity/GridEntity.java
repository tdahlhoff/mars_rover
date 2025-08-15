package org.mars_rover.grid_entity;

import org.mars_rover.Grid;
import org.mars_rover.Position;

public interface GridEntity {
    Position getPosition();
    char getLabel();
    void setGrid(Grid grid);
    Grid getGrid();
}
