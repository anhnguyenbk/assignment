package com.anhnguyen.assignment.e;

import com.anhnguyen.assignment.a.*;
import com.anhnguyen.assignment.a.interfaces.Fly;
import com.anhnguyen.assignment.a.interfaces.Sing;
import com.anhnguyen.assignment.a.interfaces.Swim;
import com.anhnguyen.assignment.a.interfaces.Walk;
import com.anhnguyen.assignment.b.*;
import com.anhnguyen.assignment.d.Butterfly;
import com.anhnguyen.assignment.d.Frog;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooter(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        int flyAnimal = (int) Arrays.stream(animals)
                                .filter(animal -> Fly.class.isAssignableFrom(animal.getClass()))
                                .count();
        System.out.println("Fly animals: " + flyAnimal);

        int walkAnimal = (int) Arrays.stream(animals)
                .filter(animal -> Walk.class.isAssignableFrom(animal.getClass()))
                .count();
        System.out.println("Walk animals: " + walkAnimal);

        int singAnimal = (int) Arrays.stream(animals)
                .filter(animal -> Sing.class.isAssignableFrom(animal.getClass()))
                .count();
        System.out.println("Sing animals: " + singAnimal);

        int swimAnimal = (int) Arrays.stream(animals)
                .filter(animal -> Swim.class.isAssignableFrom(animal.getClass()))
                .count();
        System.out.println("Swim animals: " + swimAnimal);
    }
}
