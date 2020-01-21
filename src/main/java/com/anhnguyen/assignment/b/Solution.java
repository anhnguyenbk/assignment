package com.anhnguyen.assignment.b;

import com.anhnguyen.assignment.a.interfaces.Sing;
import com.anhnguyen.assignment.a.interfaces.Swim;
import com.anhnguyen.assignment.a.interfaces.Walk;

public class Solution {
    public static void main(String[] args) {

        // Question 1
        if (! Walk.class.isAssignableFrom(Fish.class)) {
            System.out.println("Fish can not walk");
        }

        if (! Sing.class.isAssignableFrom(Fish.class)) {
            System.out.println("Fish can not sing");
        }

        if (Swim.class.isAssignableFrom(Fish.class)) {
            System.out.println("Fish can swim");
        }

        // Question 2
        Shark shark = new Shark();
        System.out.println("Shark are " + shark.size() + " and " + shark.color());
        Clownfish clownfish = new Clownfish();
        System.out.println("Clownfish are " + clownfish.size() + " and " + clownfish.color());

        clownfish.makeJokes();
        shark.eatOtherFish();

        // Question 3
        // a. Dolphin extends animal class and implement for Swim interface.

    }
}

