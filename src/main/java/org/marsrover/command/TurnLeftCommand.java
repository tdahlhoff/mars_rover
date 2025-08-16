package org.marsrover.command;

import org.marsrover.gridentity.vehicle.Vehicle;

public class TurnLeftCommand implements VehicleCommand {

    @Override
    public void execute(Vehicle vehicle) {
        vehicle.turnLeft();
    }
}
