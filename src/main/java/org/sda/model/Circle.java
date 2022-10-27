package org.sda.model;

public class Circle extends Shape {

    private float perimeter;

    private float area;

    public Circle() {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Circle(float circumference, float area, boolean isRound, float perimeter, float area1) {
        super(circumference, area, isRound);
        this.perimeter = perimeter;
        this.area = area1;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public float getArea() {
        return 30;
    }

    @Override
    public void setArea(float area) {
        this.area = area;
    }

    public float setArea() {
        return 30;
    }
}