package org.marsrover.gridentity;

import org.junit.jupiter.api.Test;
import org.marsrover.Grid;
import org.marsrover.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractGridEntityTest {

    static class ConcreteGridEntity extends AbstractGridEntity {
        public ConcreteGridEntity(Position position) {
            super(position);
        }

        @Override
        public char getLabel() {
            return 'L';
        }

        public void setPositionForTest(Position position) {
            this.setPosition(position);
        }
    }

    @Test
    void shouldReturnCorrectPosition() {
        ConcreteGridEntity entity = new ConcreteGridEntity(new Position(1, 1)) {};
        assertEquals(new Position(1, 1), entity.getPosition());
        entity.setPositionForTest(new Position(2, 2));
        assertEquals(new Position(2, 2), entity.getPosition());
    }

    @Test
    void shouldReturnCorrectGrid() {
        ConcreteGridEntity entity = new ConcreteGridEntity(new Position(1, 1)) {};
        Grid grid = new Grid(10, 10);
        entity.setGrid(grid);
        assertEquals(grid, entity.getGrid());
    }
}
