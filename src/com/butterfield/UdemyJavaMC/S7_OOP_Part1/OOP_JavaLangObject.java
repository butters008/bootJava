package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class OOP_JavaLangObject extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);
        School school = new School("Jimmy", 8, "P");
        System.out.println(school);

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class School extends Student{
    private String name;

    public School(String name, int age, String name1) {
        super(name, age);
        this.name = name1;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}