package com.anhnguyen.assignment.d;

import com.anhnguyen.assignment.a.interfaces.Fly;
import com.anhnguyen.assignment.a.interfaces.Soundable;
import com.anhnguyen.assignment.a.interfaces.Walk;

public class Solution {
    public static void main(String[] args) {

        // Question 1
        if ( Fly.class.isAssignableFrom(Butterfly.class)) {
            System.out.println("Butterfly can fly");
        }

        if (! Soundable.class.isAssignableFrom(Butterfly.class)) {
            System.out.println("Butterfly can not make a sound");
        }

        // Question 2
        if ( ! Fly.class.isAssignableFrom(Caterpillar.class)) {
            System.out.println("Caterpillar can not fly");
        }

        if (Walk.class.isAssignableFrom(Caterpillar.class)) {
            System.out.println("Caterpillar can walk");
        }
    }
}

