package org.marsrover.configuration;

import org.junit.jupiter.api.Test;
import org.marsrover.direction.*;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AppConfigTest {
    @Test
    void createDirections_shouldReturnDirections() {
        AppConfig appConfig = new AppConfig();
        Directions directions = appConfig.createDirections();
        assertInstanceOf(North.class, directions.getDirection(DirectionEnum.NORTH));
        assertInstanceOf(East.class, directions.getDirection(DirectionEnum.EAST));
        assertInstanceOf(South.class, directions.getDirection(DirectionEnum.SOUTH));
        assertInstanceOf(West.class, directions.getDirection(DirectionEnum.WEST));
    }
}
