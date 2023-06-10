package com.butterfield.UdemyJavaMC.S5_Methods;

import java.util.Random;

public class Driver {
    /**
     * TODO: Remember to use the "Compare With" when you right click on project panel (Like what you do when refactor)
     *  |-> Also there is a "show history" in that menu as well! (>_<)
     *
     * Remember - you can also overload methods as well
     */

    //basic
//    public static void main(String[] args) {
//        int score = 5;
//        calcScore(score);
//
//    }
//
//    public static void calcScore(int score){
//        score = score * 2;
//        System.out.println(score);
//    }

    // Little more advance
    public static void main(String[] args) {
        boolean gameOver = false;
        int score = 0;
        int lives = 5;

        gameLoop(gameOver, score, lives);
    }

    public static void gameLoop(boolean gameOver, int score, int lives){
        while(!gameOver){
            boolean died = figureOutRandom();

            if(died){
                System.out.println("I died");
                lives--;
                score += 2;
                System.out.println("Score " + score);
            }
            else{
                score += 5;
                System.out.println("Score " + score);
            }

            if(lives <= 0){
                gameOver = true;
                CalcGameOverScore(score);
            }
        }
    }

    public static boolean figureOutRandom(){
        // source https://stackoverflow.com/questions/8878015/return-true-or-false-randomly#:~:text=You%20can%20use%20the%20following%20for%20an%20unbiased%20result%3A,(2)%20%3D%3D%200)%20%3F
        Random random = new Random();
        //For 50% chance of true
        return (random.nextInt(2) == 0) ? true : false;
    }

    public static void CalcGameOverScore(int score){
        int finalScore = score;
        System.out.println("Final Score is: " + finalScore);
    }


}
