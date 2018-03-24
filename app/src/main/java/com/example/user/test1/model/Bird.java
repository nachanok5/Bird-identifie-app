package com.example.user.test1.model;

/**
 * Created by User on 24/3/2561.
 */

public class Bird {

    public final long id;
    public final String name;
    public final String colour1;
    public final String colour2;
    public final String size;
    public final String place1;
    public final String place2;
    public final String feature;

    public Bird(long id, String name, String colour1, String colour2, String size, String place1, String place2, String feature) {
        this.id = id;
        this.name = name;
        this.colour1 = colour1;
        this.colour2 = colour2;
        this.size = size;
        this.place1 = place1;
        this.place2 = place2;
        this.feature = feature;
    }

    @Override
    public String toString() {
        return name;
    }
}
