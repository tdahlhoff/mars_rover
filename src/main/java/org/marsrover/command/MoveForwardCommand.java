package org.marsrover.command;

import org.marsrover.gridentity.vehicle.Vehicle;

public class MoveForwardCommand implements VehicleCommand {

    @Override
    public void execute(Vehicle vehicle) {
        vehicle.moveForward(1);
    }
}
