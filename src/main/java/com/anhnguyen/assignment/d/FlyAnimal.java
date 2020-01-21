package com.anhnguyen.assignment.d;

import com.anhnguyen.assignment.a.Animal;
import com.anhnguyen.assignment.a.interfaces.Fly;

public abstract class FlyAnimal extends Animal implements Fly {
    public void fly() {
        System.out.println("I can fly");
    }
}
