package org.marsrover;

import org.marsrover.command.MoveForwardCommand;
import org.marsrover.command.TurnLeftCommand;
import org.marsrover.command.TurnRightCommand;
import org.marsrover.command.VehicleCommand;
import org.marsrover.configuration.AppConfig;
import org.marsrover.direction.Direction;
import org.marsrover.direction.DirectionEnum;
import org.marsrover.direction.Directions;
import org.marsrover.gridentity.vehicle.Rover;
import org.marsrover.pathing.PathFinder;
import org.marsrover.printer.GridPrinter;
import org.marsrover.printer.VehiclePrinter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MarsExpedition {
    public void start() {
        AppConfig appConfig = new AppConfig();
        Directions directions = appConfig.createDirections();
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner, directions);
        Plateau plateau = new Plateau();

        Grid grid = plateau.getGrid();
        GridPrinter gridPrinter = new GridPrinter(grid);

        Rover rover = inputHandler.createRover();
        VehiclePrinter vehiclePrinter = new VehiclePrinter(rover);
        grid.placeGridEntity(rover);

        gridPrinter.print();
        vehiclePrinter.print();

        /*List<VehicleCommand> commands = inputHandler.readCommands();
        rover.executeCommands(commands);*/

        Position targetPosition = inputHandler.readTargetPosition();
        PathFinder pathFinder = new PathFinder(rover.getPosition(), targetPosition, grid);
        List<Position> path = pathFinder.findPath(rover.getStepSize());
        List<VehicleCommand> commands = getCommandsFromPath(path, rover.getDirection());
        rover.executeCommands(commands);

        gridPrinter.print();
        vehiclePrinter.print();

        scanner.close();
    }

    private List<VehicleCommand> getCommandsFromPath(List<Position> path, Direction currentDirection) {

        if (path == null || path.size() < 2) {
            return new LinkedList<>();
        }

        List<VehicleCommand> commands = new LinkedList<>();

        for (int i = 1; i < path.size(); i++) {
            Position previousPosition  = path.get(i - 1);
            Position nextPosition = path.get(i);

            DirectionEnum targetDirectionEnum = determineDirection(previousPosition , nextPosition);

            while (currentDirection.getDirectionEnum() != targetDirectionEnum) {
                if (currentDirection.turnRight().getDirectionEnum() == targetDirectionEnum) {
                    commands.add(new TurnRightCommand());
                    currentDirection = currentDirection.turnRight();
                } else {
                    commands.add(new TurnLeftCommand());
                    currentDirection = currentDirection.turnLeft();
                }
            }

            commands.add(new MoveForwardCommand());
        }

        return commands;
    }

    private DirectionEnum determineDirection(Position previous, Position next) {
        if (next.y < previous.y) {
            return DirectionEnum.NORTH;
        } else if (next.y > previous.y) {
            return DirectionEnum.SOUTH;
        } else if (next.x > previous.x) {
            return DirectionEnum.EAST;
        } else if (next.x < previous.x) {
            return DirectionEnum.WEST;
        } else {
            throw new IllegalArgumentException("Keine Bewegung zwischen den Positionen.");
        }
    }

}
