package org.marsrover.direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WestTest {

    @Test
    void testTurnLeft() {
        Direction west = new West();
        Direction south = west.turnLeft();
        assertInstanceOf(South.class, south);
    }

    @Test
    void testTurnRight() {
        Direction west = new West();
        Direction north = west.turnRight();
        assertInstanceOf(North.class, north);
    }

    @Test
    void testGetDirectionEnum() {
        Direction west = new West();
        assertEquals(DirectionEnum.WEST, west.getDirectionEnum());
    }

    @Test
    void testToString() {
        Direction west = new West();
        assertEquals("W", west.toString());
    }
}