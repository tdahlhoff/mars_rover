package org.marsrover.direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SouthTest {

    @Test
    void testTurnLeft() {
        Direction south = new South();
        Direction east = south.turnLeft();
        assertInstanceOf(East.class, east);
    }

    @Test
    void testTurnRight() {
        Direction south = new South();
        Direction west = south.turnRight();
        assertInstanceOf(West.class, west);
    }

    @Test
    void testGetDirectionEnum() {
        Direction south = new South();
        assertEquals(DirectionEnum.SOUTH, south.getDirectionEnum());
    }

    @Test
    void testToString() {
        Direction south = new South();
        assertEquals("S", south.toString());
    }
}