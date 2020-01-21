package com.anhnguyen.assignment.a;

import com.anhnguyen.assignment.a.interfaces.Soundable;

public class Duck extends WalkAnimal implements Soundable {

    @Override
    public void sound() {
        System.out.println("Quack, quack");
    }
}
