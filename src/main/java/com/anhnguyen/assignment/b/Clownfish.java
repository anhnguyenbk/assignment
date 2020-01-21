package com.anhnguyen.assignment.b;

public class Clownfish extends Fish {
    @Override
    public String size() {
        return "small";
    }

    @Override
    public String color() {
        return "colorful";
    }

    public void makeJokes() {
        System.out.println("Clownfish make jokes");
    }
}
