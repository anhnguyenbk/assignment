package com.anhnguyen.assignment.a;

import com.anhnguyen.assignment.a.interfaces.Soundable;

public class Dog extends WalkAnimal implements Soundable {
    @Override
    public void sound() {
        System.out.println("Woof, woof");
    }
}
