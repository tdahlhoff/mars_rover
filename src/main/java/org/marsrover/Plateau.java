package org.marsrover;

import org.marsrover.gridentity.Rock;

public class Plateau {

    private Grid grid;

    public Plateau() {
        this.grid = new Grid(10, 10);
        grid.placeGridEntity(new Rock(new Position(7, 1)));
        grid.placeGridEntity(new Rock(new Position(3, 6)));
        grid.placeGridEntity(new Rock(new Position(5, 8)));
    }

    Grid getGrid() {
        return grid;
    }
}
