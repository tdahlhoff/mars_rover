package org.marsrover.command;

import org.marsrover.gridentity.vehicle.AbstractVehicle;

public class TurnRightCommand implements VehicleCommand {

    @Override
    public void execute(AbstractVehicle vehicle) {
        vehicle.turnRight();
    }
}
