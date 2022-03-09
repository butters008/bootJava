package com.teksystem.SoftwareClub;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
* Followed YouTube video to help get I/O working
* Java File Input/Output - It's Way Easier Than You Think
* Coding with John
* https://www.youtube.com/watch?v=ScUJx4aWRi0
* */

public class SoftwareDeveloperClub {
    private File file;
    private ArrayList<ClubMember> arr = new ArrayList<>();

    public SoftwareDeveloperClub() throws IOException { }//Software Club

    public SoftwareDeveloperClub(String fileName) throws IOException {
        file = new File(fileName);
    }//Software Club

    public void readFromFile() throws IOException {
        if(file.exists()) {
//            System.out.println("File exists: " + file.exists());
            Scanner scan = new Scanner(new FileReader(file));
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = scan.nextLine().split(",");
//                System.out.printf("Member Name: %s |City: %s |City: %s |Language %s\n", names[0], names[1], names[2], names[3]);
                    ClubMember member = new ClubMember(names[0], names[1], names[2], names[3]);
                    arr.add(member);
            }
            scan.close();
        }
        else{
            System.out.println("File does not exist or cannot be found" + file.exists());
        }
    }//end of readFromFile

    public void output(){
        for (ClubMember club: arr) {
            System.out.printf("Name: %s\n",club.getName());
            System.out.printf("City %5s, State %s\n", club.getCity(), club.getState());
            System.out.printf("Favorite Programming Language: %s\n\n", club.getLanguage());
        }
    }//end of output

    public void writeToFile() throws IOException {
        Scanner input2 = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        if(file.exists()) {
//            System.out.println("File exists: " + file.exists());

            //Enter the information for a new member, first Strings, then add vars into object
            System.out.println("Please enter new club member information");
            System.out.println("Please Enter name:");
            String name = input2.nextLine();
            System.out.println("Please Enter city:");
            String city = input2.nextLine();
            System.out.println("Please Enter state:");
            String state = input2.nextLine();
            System.out.println("Please Enter favorite programming language");
            String language = input2.nextLine();
            ClubMember newMember = new ClubMember(name, city, state, language);
            arr.add(newMember);
            for (ClubMember club : arr) {
                writer.write(club.getName()+","+club.getCity()+","+club.getState()+","+club.getLanguage()+"\n");
//                writer.close();
            }
        }
        writer.close();
    }


}//end of class
