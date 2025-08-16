package org.marsrover.printer;

import org.marsrover.gridentity.vehicle.Vehicle;

public class VehiclePrinter {
    private final Vehicle vehicle;

    public VehiclePrinter(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        String vehiclePosition = "(" + vehicle.getPosition().x + ", " + vehicle.getPosition().y + ") " +
                vehicle.getDirection();
        System.out.println(vehiclePosition);
        System.out.println();
    }
}
