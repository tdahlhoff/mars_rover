package org.marsrover.pathing;

import org.marsrover.Position;

public class Field implements Comparable<Field> {

    private int gCost;
    private final int hCost;
    private int fCost;
    private final Position currentPosition;
    private Field parent;

    public Field(Position currentPosition, int gCost, Position endPosition) {
        this.currentPosition = currentPosition;
        this.gCost = gCost;
        this.hCost = calculateHCost(endPosition);
        this.updateFCost();
    }

    private int calculateHCost(Position endPosition) {
        return Math.abs(currentPosition.x - endPosition.x) + Math.abs(currentPosition.y - endPosition.y);
    }

    public int getGCost() {
        return gCost;
    }
    public int getFCost() {
        return fCost;
    }
    public Position getPosition() {
        return currentPosition;
    }
    public Field getParent() {
        return parent;
    }

    public void setParent(Field parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Field field = (Field) obj;
        return currentPosition.equals(field.currentPosition);
    }

    @Override
    public int hashCode() {
        return currentPosition.hashCode();
    }

    @Override
    public int compareTo(Field other) {
        return Integer.compare(this.fCost, other.fCost);
    }

    public void setGCost(int newGCost) {
        this.gCost = newGCost;
    }

    public void updateFCost() {
        this.fCost = this.gCost + this.hCost;
    }
}