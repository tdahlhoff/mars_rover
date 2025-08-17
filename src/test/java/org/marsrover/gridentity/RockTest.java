package org.marsrover.gridentity;

import org.junit.jupiter.api.Test;
import org.marsrover.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockTest {
    @Test
    void shouldReturnCorrectLabel() {
        Rock rock = new Rock(new Position(1, 1));
        assertEquals('▲', rock.getLabel());
    }
}
