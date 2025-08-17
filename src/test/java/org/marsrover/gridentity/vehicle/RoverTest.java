package org.marsrover.gridentity.vehicle;

import org.junit.jupiter.api.Test;
import org.marsrover.Grid;
import org.marsrover.Position;
import org.marsrover.command.MoveForwardCommand;
import org.marsrover.command.TurnLeftCommand;
import org.marsrover.command.TurnRightCommand;
import org.marsrover.direction.East;
import org.marsrover.direction.North;
import org.marsrover.direction.West;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class RoverTest {

    @Test
    void returnsCorrectLabel() {
        Rover rover = new Rover(new Position(1, 1), new North());
        assertEquals('R', rover.getLabel());
    }

    @Test
    void returnsCorrectStepSize() {
        Rover rover = new Rover(new Position(1, 1), new North());
        assertEquals(1, rover.getStepSize());
    }

    @Test
    void verifyMoveForward() {
        Rover rover = new Rover(new Position(1, 1), new North());
        rover.setGrid(new Grid(10, 10));
        MoveForwardCommand command = new MoveForwardCommand();
        command.execute(rover);
        assertEquals(new Position(1, 0), rover.getPosition());
    }

    @Test
    void verifyTurnLeft() {
        Rover rover = new Rover(new Position(1, 1), new North());
        rover.setGrid(new Grid(10, 10));
        TurnLeftCommand command = new TurnLeftCommand();
        command.execute(rover);
        assertInstanceOf(West.class, rover.getDirection());
    }

    @Test
    void verifyTurnRight() {
        Rover rover = new Rover(new Position(1, 1), new North());
        rover.setGrid(new Grid(10, 10));
        TurnRightCommand command = new TurnRightCommand();
        command.execute(rover);
        assertInstanceOf(East.class, rover.getDirection());
    }
}
