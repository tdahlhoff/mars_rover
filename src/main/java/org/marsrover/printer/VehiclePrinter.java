package org.marsrover.printer;

import org.marsrover.gridentity.vehicle.AbstractVehicle;

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
