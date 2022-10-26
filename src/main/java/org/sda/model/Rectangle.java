package org.sda.model;

public class Rectangle extends Shape {

    private boolean isSquare;
    private boolean hasFourSides;

    public Rectangle(float circumference, boolean isRound, float area, boolean isSquare, boolean hasFourSides) {
        super(circumference, isRound, area);
        this.isSquare = isSquare;
        this.hasFourSides = hasFourSides;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }

    public boolean isHasFourSides() {
        return hasFourSides;
    }

    public void setHasFourSides(boolean hasFourSides) {
        this.hasFourSides = hasFourSides;
    }

    @Override
    public String getShape() {
        return "Area " + super.getArea();
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "isSquare=" + isSquare +
                ", hasFourSides=" + hasFourSides +
                '}';
    }
}




