package org.sda.model;

public class Circle extends Rectangle {

    private int radius;
    private int size;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Circle(float circumference, boolean isRound, float area, boolean isSquare, boolean hasFourSides, int radius, int size) {
        super(circumference, isRound, area, isSquare, hasFourSides);
        this.radius = radius;
        this.size = size;
    }
    @Override
    public String getShape1 () {
        return "Area " + super.g + ", Shape: " + getShape();
    }
}
