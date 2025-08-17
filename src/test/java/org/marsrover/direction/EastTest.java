package org.marsrover.direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EastTest {

    @Test
    void testTurnLeft() {
        Direction east = new East();
        Direction north = east.turnLeft();
        assertInstanceOf(North.class, north);
    }

    @Test
    void testTurnRight() {
        Direction east = new East();
        Direction south = east.turnRight();
        assertInstanceOf(South.class, south);
    }

    @Test
    void testGetDirectionEnum() {
        Direction east = new East();
        assertEquals(DirectionEnum.EAST, east.getDirectionEnum());
    }

    @Test
    void testToString() {
        Direction east = new East();
        assertEquals("E", east.toString());
    }
}