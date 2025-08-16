package org.marsrover.command;

import org.marsrover.gridentity.vehicle.AbstractVehicle;

public class MoveForwardCommand implements VehicleCommand {

    @Override
    public void execute(AbstractVehicle vehicle) {
        vehicle.moveForward(1);
    }
}
