package org.mars_rover;

import org.mars_rover.direction.North;
import org.mars_rover.plateauEntity.Rock;
import org.mars_rover.plateauEntity.vehicle.Rover;

public class Main {
    public static void main(String[] args) {
        try {
            Plateau plateau = new Plateau(10, 10);
            Rover rover = new Rover(new Position(1, 5), new North());
            plateau.placePlateauEntity(rover);
            plateau.printPlateau();
            Rock rock1 = new Rock(new Position(7, 1));
            Rock rock2 = new Rock(new Position(1, 9));
            plateau.placePlateauEntity(rock1);
            plateau.placePlateauEntity(rock2);
            plateau.printPlateau();
            rover.moveForward(plateau, 1);
            plateau.printPlateau();
            rover.turnRight();
            rover.moveForward(plateau, 6);
            plateau.printPlateau();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}