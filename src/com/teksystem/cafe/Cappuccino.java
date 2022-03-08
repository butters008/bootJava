package com.teksystem.cafe;

public class Cappuccino extends Product{
    private boolean peppermint;
    private boolean whippedCream;

    public Cappuccino(){
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream){
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public double calcProductTotal(double productPrice, int quantity) {
        double total = (productPrice * quantity);
        if(this.isPeppermint() == true){
            total += 2.00;
        }
        if(this.isWhippedCream() == true){
            total += 1.00;
        }
        return total;
    }

    @Override
    public void addOptions(int choice) {
        if(choice == 1 || choice == 3){
            setPeppermint(true);
        }
        if(choice == 2 || choice == 3){
            setWhippedCream(true);
        }

    }

    @Override
    public String printOptions() {
        return "Would you like Peppermint(1), Whipped Cream(2), or both(3), or (4) for nothing";
    }

    @Override
    public String printRecipt(Product product) {
        String output = "";
        Cappuccino cappuccino = (Cappuccino) product;
        //I know this can be simplified down, but I am doing lown way to make sure that point is coming accross
        if(cappuccino.peppermint == true && cappuccino.whippedCream == false){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    cappuccino.getName(), cappuccino.getPrice(), 1,
                    cappuccino.calcProductTotal(cappuccino.getPrice(), 1)));
            System.out.println("\t" + String.format("Whipped Cream: (Add $1) %-15s Peppermint: %s", cappuccino.peppermint, cappuccino.whippedCream));
        }
        else if(cappuccino.peppermint == false && cappuccino.whippedCream == true){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    cappuccino.getName(), cappuccino.getPrice(), 1,
                    cappuccino.calcProductTotal(cappuccino.getPrice(), 1)));
            System.out.println("\t" + String.format("Whipped Cream: %-15s Peppermint: (Add $2) %s", cappuccino.peppermint, cappuccino.whippedCream));
        }
        else if(cappuccino.peppermint == true && cappuccino.whippedCream == true){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    cappuccino.getName(), cappuccino.getPrice(), 1,
                    cappuccino.calcProductTotal(cappuccino.getPrice(), 1)));
            System.out.println("\t" + String.format("Whipped Cream: (Add $1) %-15s Peppermint: (Add $2) %s", cappuccino.peppermint, cappuccino.whippedCream));
        }
        else{
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    cappuccino.getName(), cappuccino.getPrice(), 1,
                    cappuccino.calcProductTotal(cappuccino.getPrice(), 1)));
            System.out.println("\t" + String.format("Whipped Cream: %-15s Peppermint: %s", cappuccino.peppermint, cappuccino.whippedCream));
        }
        return output;
    }
}
