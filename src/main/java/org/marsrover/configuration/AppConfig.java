package org.marsrover.configuration;

import org.marsrover.direction.*;

import java.util.Map;

public class AppConfig {
    public Directions createDirections() {
        Map<DirectionEnum, Direction> directionMap = Map.of(
                DirectionEnum.NORTH, new North(),
                DirectionEnum.EAST, new East(),
                DirectionEnum.SOUTH, new South(),
                DirectionEnum.WEST, new West()
        );
        return new Directions(directionMap);
    }
}
