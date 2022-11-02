package org.sda.model;

public class Circle extends Shape {


    public Circle() {
    }

    public Circle(float perimeter, float circumference, float area, boolean isRound) {
        super(perimeter, circumference, area, isRound);
    }

    public Circle(float circumference, float area, boolean isRound) {
        super(circumference, area, isRound);
    }

    //Implement and verify getPerimeter and getArea
    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of circle");
    }
    @Override
    public void getArea() {
        System.out.println("Area of circle");

    }
}