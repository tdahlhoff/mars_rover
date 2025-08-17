package org.marsrover.direction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.marsrover.configuration.AppConfig;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class DirectionsTest {

    private Directions directions;

    @BeforeEach
    public void setUp() {
        AppConfig appConfig = new AppConfig();
        directions = appConfig.createDirections();
    }

    @Test
    void getDirectionValid() {
        assertInstanceOf(North.class, directions.getDirection(DirectionEnum.NORTH));
        assertInstanceOf(East.class, directions.getDirection(DirectionEnum.EAST));
        assertInstanceOf(South.class, directions.getDirection(DirectionEnum.SOUTH));
        assertInstanceOf(West.class, directions.getDirection(DirectionEnum.WEST));
    }

    @Test
    void directionForAllEnumsExist() {
        for (DirectionEnum directionEnum : DirectionEnum.values()) {
            assertDoesNotThrow(() -> directions.getDirection(directionEnum));
        }
    }

    @Test
    void throwsExceptionForInvalidDirectionEnum() {
        Directions directions = new Directions(Collections.emptyMap());

        IllegalStateException exception = assertThrows(IllegalStateException.class, () ->
                directions.getDirection(DirectionEnum.NORTH));

        String expectedMessage = "No Direction linked to given DirectionEnum: " + DirectionEnum.NORTH;
        assertEquals(expectedMessage, exception.getMessage());
    }
}
