package com.anhnguyen.assignment.b;

import com.anhnguyen.assignment.a.Animal;
import com.anhnguyen.assignment.a.interfaces.Swim;

public abstract class SwimAnimal extends Animal implements Swim {
    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
