package com.anhnguyen.assignment.a;

import com.anhnguyen.assignment.a.interfaces.Walk;


public abstract class WalkAnimal extends Animal implements Walk {
    public void walk() {
        System.out.println("I am walking");
    }
}
