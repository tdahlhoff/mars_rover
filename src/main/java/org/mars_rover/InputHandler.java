package org.mars_rover;

import org.mars_rover.command.MoveForwardCommand;
import org.mars_rover.command.TurnLeftCommand;
import org.mars_rover.command.TurnRightCommand;
import org.mars_rover.command.VehicleCommand;
import org.mars_rover.direction.Direction;
import org.mars_rover.direction.DirectionEnum;
import org.mars_rover.direction.Directions;
import org.mars_rover.grid_entity.vehicle.Rover;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;
    private final Map<Character, VehicleCommand> vehicleCommandMap = Map.of(
            'L', new TurnLeftCommand(),
            'R', new TurnRightCommand(),
            'M', new MoveForwardCommand()
    );

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Rover createRover() {
        System.out.println("Bitte gib die Startposition des Rovers ein (z.B. 10 5):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Bitte gib die Ausrichtung des Rovers ein (N, S, E, W):");
        String orientation = scanner.next();
        DirectionEnum directionEnum = DirectionEnum.fromString(orientation);
        Direction direction = Directions.getDirection(directionEnum);
        return new Rover(new Position(x, y), direction);
    }

    public List<VehicleCommand> readCommands() {
        System.out.println("Gib nun die Befehle ein (L R M):");
        String commandList = scanner.next().toUpperCase();
        List<VehicleCommand> commands = new java.util.LinkedList<>();
        for (char command : commandList.toCharArray()) {
            if (!vehicleCommandMap.containsKey(command)) {
                throw new IllegalArgumentException("Unknown command: " + command);
            }
            commands.add(vehicleCommandMap.get(command));
        };
        return commands;
    }

    public Position readTargetPosition() {
        System.out.println("Gib nun die Ziel-Koordinaten ein (z.B. 10 5):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Position(x, y);
    }
}
