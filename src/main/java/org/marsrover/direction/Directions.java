package org.marsrover.direction;

import java.util.Map;

public class Directions {
    private final Map<DirectionEnum, Direction> directions;

    public Directions(Map<DirectionEnum, Direction> directions) {
        this.directions = directions;
    }

    public Direction getDirection(DirectionEnum directionEnum) {
        if (!directions.containsKey(directionEnum)) {
            throw new IllegalStateException("No Direction linked to given DirectionEnum: " + directionEnum);
        }
        return directions.get(directionEnum);
    }
}
