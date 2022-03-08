package com.teksystem.cafe;

public class Coffee extends Product{
    private boolean milk;
    private boolean sugar;

    public Coffee() {
        super();
        this.milk = false;
        this.sugar = false;
    }

    public Coffee(String name, double price, String description, boolean milk, boolean sugar) {
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public double calcProductTotal(double productPrice, int quantity) {
        double total = (productPrice * quantity);
        if(this.isMilk() == true){
            total += 2.00;
        }
        if(this.isSugar() == true){
            total += 1.00;
        }
        return total;
    }

    @Override
    public void addOptions(int choice) {
        if(choice == 1 || choice == 3){
            setSugar(true);
        }
        if(choice == 2 || choice == 3){
            setMilk(true);
        }
    }

    @Override
    public String printOptions() {
        return "Would you like Sugar(1), Milk(2), or both(3), or (4) for nothing";
    }

    @Override
    public String printRecipt(Product product) {
        String output = "";
        Coffee coffee = (Coffee) product;
        //I know this can be simplified down, but I am doing long way to make sure that point is coming accross
        if(coffee.sugar == true && coffee.milk == false){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    coffee.getName(), coffee.getPrice(), 1,
                    coffee.calcProductTotal(coffee.getPrice(), 1)));
            System.out.println("\t" + String.format("Sugar: (Add $1) %-15s Milk: %s", coffee.sugar, coffee.milk));
        }
        else if(coffee.sugar == false && coffee.milk == true){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    coffee.getName(), coffee.getPrice(), 1,
                    coffee.calcProductTotal(coffee.getPrice(), 1)));
            System.out.println("\t" + String.format("Sugar: %-15s Milk: (Add $2) %s", coffee.sugar, coffee.milk));
        }
        else if(coffee.sugar == true && coffee.milk == true){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    coffee.getName(), coffee.getPrice(), 1,
                    coffee.calcProductTotal(coffee.getPrice(), 1)));
            System.out.println("\t" + String.format("Sugar: (Add $1) %-15s Milk: (Add $2) %s", coffee.sugar, coffee.milk));
        }
        else{
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    coffee.getName(), coffee.getPrice(), 1,
                    coffee.calcProductTotal(coffee.getPrice(), 1)));
            System.out.println("\t" + String.format("Sugar: %-15s Milk: %s", coffee.sugar, coffee.milk));
        }
        return output;
    }
}
