package org.marsrover.direction;

import java.util.Map;

public class Directions {
    private static final Map<DirectionEnum, Direction> directions = Map.of(
            DirectionEnum.NORTH, new North(),
            DirectionEnum.EAST, new East(),
            DirectionEnum.SOUTH, new South(),
            DirectionEnum.WEST, new West()
    );

    public static Direction getDirection(DirectionEnum directionEnum) {
        return directions.get(directionEnum);
    }
}
