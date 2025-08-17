package org.marsrover.command;

import org.junit.jupiter.api.Test;
import org.marsrover.gridentity.vehicle.Vehicle;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MoveForwardCommandTest {

    @Test
    void execute_shouldCallMoveForwardOnVehicle() {
        Vehicle mockVehicle = mock(Vehicle.class);
        MoveForwardCommand command = new MoveForwardCommand();
        command.execute(mockVehicle);
        verify(mockVehicle).moveForward(1);
    }
}