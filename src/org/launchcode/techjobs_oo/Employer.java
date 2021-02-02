package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer {
    private int id;
    //since nextId is static, its changing value is not stored within any Employer object
    private static int nextId = 1;
    private String value;

    //Every new Employer object will get a different ID number
    public Employer() {
        id = nextId;
        nextId++;s
    }
    //assigns value to value field, and initializes id for the object by calling the first constructor with the this() statement
    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
