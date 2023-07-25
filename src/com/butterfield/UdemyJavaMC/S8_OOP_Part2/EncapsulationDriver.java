package com.butterfield.UdemyJavaMC.S8_OOP_Part2;

import org.w3c.dom.ls.LSOutput;

public class EncapsulationDriver {

    public static void main(String[] args) {
        EncapsultationExample player = new EncapsultationExample("Keith", 500, "mace");
        EncapsultationExample player2 = new EncapsultationExample("Nicole");

        System.out.println("Your initial health is " + player.remainingHealth());


    }



}
