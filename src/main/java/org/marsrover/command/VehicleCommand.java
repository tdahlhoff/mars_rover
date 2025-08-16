package org.marsrover.command;

import org.marsrover.gridentity.vehicle.AbstractVehicle;

public interface VehicleCommand {
    void execute(AbstractVehicle vehicle);
}
