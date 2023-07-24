package com.butterfield.UdemyJavaMC.S7_OOP_Part1;

public class OOP_Inheritance_Child extends OOP_Inheritance_Parent{

    private String earShape;
    private String tailShape;

    //implicit (if no args or declared constructors
    public OOP_Inheritance_Child(){
        super(); //Errors out since we have no empty constructors in parent - Now we do, no errors
    }

    public OOP_Inheritance_Child(String type, String size, double weight) {
        super(type, size, weight);
    }

    //Calls on constuctor below since this() has 4 params like that one
    //Called constructor chaining
    public OOP_Inheritance_Child(String type, double weight){
        this(type, weight, "perky", "curled");
    }

    public OOP_Inheritance_Child(String type, double weight, String earShape, String tailShape) {
        super(type,
                weight < 15 ? "small" : (weight < 35 ? "medium" : "large") //conditional to set size based on weight
                , weight); //Conditional to be passed to super, needs to be done in super first.
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Additional Code I run in Subcalss....");
        //Conditional to run in Subclass
        if(speed == "slow"){
            walk();
            tail();
        }
        else{
            run();
            bark();
        }
    }

    // This is an example of Overriding a method from Super to sub class
    public void noise(){
        //With no code in here, prints out nothing -- Only trus with no code, adding code so its just a reminder

        //Changed private to protected
        if(type == "kid"){
            System.out.println("They are even louder");
            return;
        }
        bark();



    }

    //This is an example of changing the code in subclass and having it run both sub and super
    @Override
    public String toString() {
        return "OOP_Inheritance_Child{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private void bark(){
        System.out.println("Woof");
    }
    private void run(){
        System.out.println("child running");
    }
    private void walk(){
        System.out.println("child walking");
    }
    private void tail(){
        System.out.println("child magic tail wagging");
    }
}
