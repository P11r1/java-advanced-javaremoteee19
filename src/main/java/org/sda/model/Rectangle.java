package org.sda.model;

public class Rectangle extends Shape {

    private float sideLength;



    public Rectangle() {
        this.sideLength = sideLength;

    }

    public Rectangle(float circumference, float area, boolean isRound, float sideLength, float area1) {
        super(circumference, area, isRound);
        this.sideLength = sideLength;

    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }






    //Implement and verify getPerimeter and getArea


    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of rectangle");
    }


    @Override
    public void getArea() {
        System.out.println("Area of rectangle");


    }
}





