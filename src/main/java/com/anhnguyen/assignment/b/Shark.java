package com.anhnguyen.assignment.b;

public class Shark extends Fish {
    @Override
    public String size() {
        return "large";
    }

    @Override
    public String color() {
        return "grey";
    }

    public void eatOtherFish() {
        System.out.println("Shark eat other fish");
    }
}
