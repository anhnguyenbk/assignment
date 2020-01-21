package com.anhnguyen.assignment.a;

import com.anhnguyen.assignment.a.interfaces.Fly;
import com.anhnguyen.assignment.a.interfaces.Sing;

public class Bird extends WalkAnimal implements Fly, Sing {
    public void fly() {
        System.out.println("I am flying");
    }

    /**
     * Implement sing method for the bird.
     */
    public void sing() {
        System.out.println("I am singing");
    }
}
