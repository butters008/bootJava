package com.butterfield.UdemyJavaMC.S8_OOP_Part2;

public class EncapsultationExample {
    private String name;
    private int health;
    private String weapon;

    public EncapsultationExample(String name) {
        this.name = name;
        this.health = 100;
        this.weapon = "sword";
    }

    public EncapsultationExample(String name, int health, String weapon) {
        this.name = name;
        if(health <= 0 ){
            this.health = 1;
        }else if (health >= 100){
            this.health = 100;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(health <= 0 )
            System.out.println("Player is knocked out of the game");
    }

    public int remainingHealth(){
        return health;
    }

    public void restoreHealth(int health){
        this.health += health;
        if(this.health > 100){
            System.out.println("Player fully restored");
            System.out.println("Player: " + remainingHealth());
            this.health = 100;
        }
        else{
            System.out.println("Player: " + remainingHealth());
        }
    }
}
