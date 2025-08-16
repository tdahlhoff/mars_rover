package org.marsrover.gridentity;

import org.marsrover.Grid;
import org.marsrover.Position;

public interface GridEntity {
    Position getPosition();
    char getLabel();
    void setGrid(Grid grid);
    Grid getGrid();
}
