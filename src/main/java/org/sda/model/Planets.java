package org.sda.model;

/**
 * Enum exercise
 *
 * 1. Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * E.g. „Huge Jupiter”, „Small Pluto”.
 * b) Create distanceFromEarth method.
 * c) Verify both methods for multiple planets
 *
 * @author Marko
 */
public enum Planets {
    MARS(250000, "Red Mars"), //Enum values because constructor has relativeSize and String name
    EARTH(200000, "My Earth"),
    JUPITER(360000, "Huge Jupiter"),
    SATURN(780000, "Ring Saturn"),
    PLUTO(100000000, "Small Pluto"),
    VENUS(950000, "Damn Venus");

    private float relativeSize;
    private String name;

    // constructor
    Planets(float relativeSize, String name) {
        this.relativeSize = relativeSize;
        this.name = name;
    }

    //Setter
    public void setRelativeSize(float relativeSize) {
        this.relativeSize = relativeSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString override
    @Override
    public String toString() {
        return "Planets{" +
                "relativeSize=" + relativeSize +
                ", name='" + name + '\'' +
                '}';
    }

    public double distanceFromEarth() {
        return EARTH.relativeSize - this.relativeSize;
    }
}
