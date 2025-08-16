package org.marsrover.printer;

import org.marsrover.Grid;
import org.marsrover.gridentity.GridEntity;

public class GridPrinter {
    private final Grid grid;

    public GridPrinter(Grid grid) {
        this.grid = grid;
    }

    public void print() {
        char[][] chars = new char[grid.getDimensionY()][grid.getDimensionX()];

        for (int row = 0; row < grid.getDimensionY(); row++) {
            for (int col = 0; col < grid.getDimensionX(); col++) {
                chars[row][col] = '·';
            }
        }

        for (GridEntity gridEntity : grid.getGridEntities()) {
            chars[gridEntity.getPosition().y][gridEntity.getPosition().x] = gridEntity.getLabel();
        }

        for (char[] row : chars) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }

        System.out.println();
    }
}
