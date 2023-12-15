package com.driver;

public class RWOnly {
    private String name; // Private member variable

    // Constructor
    public RWOnly(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
