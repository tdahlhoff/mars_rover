package org.mars_rover;

import org.mars_rover.command.VehicleCommand;
import org.mars_rover.grid_entity.vehicle.Rover;
import org.mars_rover.printer.GridPrinter;
import org.mars_rover.printer.VehiclePrinter;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            InputHandler inputHandler = new InputHandler(scanner);
            Plateau plateau = new Plateau();

            Grid grid = plateau.getGrid();
            GridPrinter gridPrinter = new GridPrinter(grid);

            Rover rover = inputHandler.createRover();
            VehiclePrinter vehiclePrinter = new VehiclePrinter(rover);
            grid.placeGridEntity(rover);

            gridPrinter.print();
            vehiclePrinter.print();

            List<VehicleCommand> commands = inputHandler.readCommands();
            rover.executeCommands(commands);

            gridPrinter.print();
            vehiclePrinter.print();

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}