package org.marsrover.direction;

public enum DirectionEnum {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private final String code;

    DirectionEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static DirectionEnum fromString(String direction) {
        for (DirectionEnum directionEnum : DirectionEnum.values()) {
            if(directionEnum.getCode().equalsIgnoreCase(direction)) {
                return directionEnum;
            }
        }
        throw new IllegalArgumentException("Invalid direction: " + direction);
    }
}
