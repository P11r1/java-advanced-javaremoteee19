package org.sda.model;

/**
 * Create a Shape class.
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
 * Which fields and methods are common?
 *
 * @author Marko
 */
public abstract class Shape {

    public Shape () {

    }
    private float circumference;

    private boolean isRound;

    private float area;

    public Shape(float circumference, boolean isRound, float area) {
        this.circumference = circumference;
        this.isRound = isRound;
        this.area = area;
    }

    public float getCircumference() {
        return circumference;
    }

    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }


    public abstract String getShape();
}
