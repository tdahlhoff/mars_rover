package org.mars_rover.command;

import org.mars_rover.grid_entity.vehicle.AbstractVehicle;

public class TurnLeftCommand implements VehicleCommand {

    @Override
    public void execute(AbstractVehicle vehicle) {
        vehicle.turnLeft();
    }
}
