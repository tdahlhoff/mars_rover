package org.marsrover.command;

import org.junit.jupiter.api.Test;
import org.marsrover.gridentity.vehicle.Vehicle;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class TurnRightCommandTest {

    @Test
    void execute_shouldCallTurnRightOnVehicle() {
        Vehicle mockVehicle = mock(Vehicle.class);
        TurnRightCommand command = new TurnRightCommand();
        command.execute(mockVehicle);
        verify(mockVehicle).turnRight();
    }
}