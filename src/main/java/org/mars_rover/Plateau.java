package org.mars_rover;

import org.mars_rover.grid_entity.Rock;

public class Plateau {

    private Grid grid;

    public Plateau() {
        this.grid = new Grid(10, 10);
        Rock rock1 = new Rock(new Position(7, 1));
        Rock rock2 = new Rock(new Position(1, 9));
        grid.placeGridEntity(rock1);
        grid.placeGridEntity(rock2);
    }

    Grid getGrid() {
        return grid;
    }
}
