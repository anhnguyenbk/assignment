package com.anhnguyen.assignment.a;

import com.anhnguyen.assignment.a.interfaces.Fly;
import com.anhnguyen.assignment.a.interfaces.Swim;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        // Question 2
        System.out.println("Question 2");
        Duck duck = new Duck();

        // 2.a - A duck says
        duck.sound();

        // 2.b - A duck can swim?
        if (duck instanceof Swim) {
            System.out.println("Duck can swim");
        } else {
            System.out.println("Duck can not swim");
        }

        Chicken chicken  = new Chicken();

        // 2.c - A chicken says
        chicken.sound();

        // 2.d - A chicken can fly
        if (chicken instanceof Fly) {
            System.out.println("Chicken can fly");
        } else {
            System.out.println("Chicken can not fly");
        }


        // Question 3
        System.out.println("Question 3");
        Rooter rooter = new Rooter();

        // 3.a - A rooter says
        rooter.sound();

        // 3.b - Rooter is a type of chicken (Rooter class is a child of Chicken class)
        // 3.c

        // Question 4
        // 4.a
        Parrot parrotLivingWithDog = new Parrot(new Dog());
        parrotLivingWithDog.sound();

        // 4.b
        Parrot parrotLivingWithCat = new Parrot(new Cat());
        parrotLivingWithCat.sound();

        // 4.c
        Parrot parrotLivingWithRooter = new Parrot(new Rooter());
        parrotLivingWithRooter.sound();

        // 4.d - A parrot object will says same with a livingWith object (implemented soundable).
    }
}

