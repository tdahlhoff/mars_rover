package org.mars_rover.command;

import org.mars_rover.grid_entity.vehicle.AbstractVehicle;

public interface VehicleCommand {
    void execute(AbstractVehicle vehicle);
}
