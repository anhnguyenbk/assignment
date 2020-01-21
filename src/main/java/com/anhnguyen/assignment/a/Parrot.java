package com.anhnguyen.assignment.a;

import com.anhnguyen.assignment.a.interfaces.Soundable;

public class Parrot extends WalkAnimal implements Soundable {
    private Soundable livingWith;

    public Parrot() {

    }

    public Parrot(Soundable livingWith) {
        this.livingWith = livingWith;
    }

    @Override
    public void sound() {
        if (livingWith != null) {
            livingWith.sound();
        }
    }
}
