package org.launchcode.techjobs.oo.test;

import java.util.Objects;

public class JobField {

    //fields
    int id;
    int nextId;
    String value;

    //constructors
    public JobField () {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
        this();
        this.value = value;
    }


    //getters/setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    //custom methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



}
