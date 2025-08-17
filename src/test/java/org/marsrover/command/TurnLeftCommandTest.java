package org.marsrover.command;

import org.junit.jupiter.api.Test;
import org.marsrover.gridentity.vehicle.Vehicle;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class TurnLeftCommandTest {

    @Test
    void execute_shouldCallTurnLeftOnVehicle() {
        Vehicle mockVehicle = mock(Vehicle.class);
        TurnLeftCommand command = new TurnLeftCommand();
        command.execute(mockVehicle);
        verify(mockVehicle).turnLeft();
    }
}