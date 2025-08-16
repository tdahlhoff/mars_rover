package org.marsrover.command;

import org.marsrover.gridentity.vehicle.Vehicle;

public interface VehicleCommand {
    void execute(Vehicle vehicle);
}
