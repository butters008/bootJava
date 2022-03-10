package com.teksystem.SoftwareClub;

import java.io.IOException;
import java.util.Scanner;

public class ClubMemberApp {
    public static void main(String[] args) throws IOException {
//        Have to pass in the literal location for file since passing it from driver to SoftwareDeveloperClub class
        SoftwareDeveloperClub softwareDeveloperClub = new SoftwareDeveloperClub("C:/Users/kbutt/IdeaProjects/bootJava/src/com/teksystem/SoftwareClub/members.txt");

        softwareDeveloperClub.readFromFile();

        //Sticking the menu in this file, because I am getting tired of this assignment with the vague instructions
        int menuOption = 0;
        Scanner input = new Scanner(System.in);
        while(menuOption != 4){
            System.out.println("Please select the following options");
            System.out.println("1) Display Members\n2) Remove Members\n3) Add Members\n4) Quit the Program");
            menuOption = input.nextInt();
            switch (menuOption){
                case 1:
                    softwareDeveloperClub.output();
                    break;
                case 2:
                    System.out.println("Please enter the name for the member to be delete: ");
                    String name = input.nextLine(); //To clear the buffer so String can be accepted
                    name = input.nextLine();
                    softwareDeveloperClub.deleteFromFile(name);
                    break;
                case 3:
                    softwareDeveloperClub.writeToFile();
                    break;
                case 4:
                    System.out.println("Quitting the program");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }//end of while
    }//end of main
}//end of class

