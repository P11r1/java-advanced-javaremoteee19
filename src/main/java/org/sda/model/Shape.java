package org.sda.model;

/**
 * Create a Shape class.
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
 * Which fields and methods are common?
 *
 * @author Marko
 */

//Make shape abstract class
public abstract class Shape {

    private float perimeter;

    private float circumference;

    private float area;

    private boolean isRound;

    public Shape() {

    }

    public Shape(float perimeter, float circumference, float area, boolean isRound) {
        this.perimeter = perimeter;
        this.circumference = circumference;
        this.area = area;
        this.isRound = isRound;
    }

    public Shape(float circumference, float area, boolean isRound){
        this.circumference = circumference;
        this.area = area;
        this.isRound = isRound;
    }

    public float getCircumference () {
        return circumference;
    }

    public void setCircumference ( float circumference ){
        this.circumference = circumference;
    }


    public void setArea ( float area ) {
        this.area = area;
    }

    public boolean isRound () {
        return isRound;
    }

    public void setRound ( boolean round ){
        isRound = round;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    //Add getArea and getPerimeter methods to Shape abstract class
    public abstract void getPerimeter();


    public abstract void getArea();
}