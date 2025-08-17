package org.marsrover.direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NorthTest {

    @Test
    void testTurnLeft() {
        Direction north = new North();
        Direction west = north.turnLeft();
        assertInstanceOf(West.class, west);
    }

    @Test
    void testTurnRight() {
        Direction north = new North();
        Direction east = north.turnRight();
        assertInstanceOf(East.class, east);
    }

    @Test
    void testGetDirectionEnum() {
        Direction north = new North();
        assertEquals(DirectionEnum.NORTH, north.getDirectionEnum());
    }

    @Test
    void testToString() {
        Direction north = new North();
        assertEquals("N", north.toString());
    }
}