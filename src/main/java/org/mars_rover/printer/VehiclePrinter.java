package org.mars_rover.printer;

import org.mars_rover.grid_entity.vehicle.AbstractVehicle;

public class VehiclePrinter {
    private final AbstractVehicle vehicle;

    public VehiclePrinter(AbstractVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        String vehiclePosition = "(" + vehicle.getPosition().x + ", " + vehicle.getPosition().y + ") " +
                vehicle.getDirection();
        System.out.println(vehiclePosition);
        System.out.println();
    }
}
