package org.marsrover.direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DirectionEnumTest {

    @Test
    void testFromStringValid() {
        assertEquals(DirectionEnum.NORTH, DirectionEnum.fromString("N"));
        assertEquals(DirectionEnum.EAST, DirectionEnum.fromString("E"));
        assertEquals(DirectionEnum.SOUTH, DirectionEnum.fromString("S"));
        assertEquals(DirectionEnum.WEST, DirectionEnum.fromString("W"));
    }

    @Test
    void testFromStringValidLowerCase() {
        assertEquals(DirectionEnum.NORTH, DirectionEnum.fromString("n"));
    }

    @Test
    void testFromStringInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            DirectionEnum.fromString("X");
        });
    }

    @Test
    void testGetCode() {
        assertEquals("N", DirectionEnum.NORTH.getCode());
        assertEquals("E", DirectionEnum.EAST.getCode());
        assertEquals("S", DirectionEnum.SOUTH.getCode());
        assertEquals("W", DirectionEnum.WEST.getCode());
    }
}