package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwObject = new RWOnly("Initial Value");
        // Attempting to set a value directly (error expected)
        // rwObject.name = "DirectAccess"; // This will result in a compilation error
        // Attempting to print the value directly (error expected)
        // System.out.println(rwObject.name); // This will result in a compilation error
        rwObject.setName("New Value");
        System.out.println(rwObject.getName());
    }
}