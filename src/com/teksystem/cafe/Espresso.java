package com.teksystem.cafe;

public class Espresso extends Product{

    private boolean extraShot;
    private boolean macchiato;

    public Espresso() {
        this.extraShot = false;
        this.macchiato = false;
    }

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato){
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    @Override
    public double calcProductTotal(double productPrice, int quantity) {
        double total = (productPrice * quantity);
        if(this.isExtraShot() == true){
            total += 2.00;
        }
        if(this.isMacchiato() == true){
            total += 1.00;
        }
        return total;
    }

    @Override
    public void addOptions(int choice) {
        if(choice == 1 || choice == 3){
            setExtraShot(true);
        }
        if(choice == 2 || choice == 3){
            setMacchiato(true);
        }
    }

    @Override
    public String printOptions() {
        return "Would you like for an Extra Shot(1), Macchiato(2), or both(3), or (4) for nothing";
    }

    @Override
    public String printRecipt(Product product) {
        String output = "";
        Espresso espresso = (Espresso) product;
        //I know this can be simplified down, but I am doing lown way to make sure that point is coming accross
        if(espresso.extraShot == true && espresso.macchiato == false){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    espresso.getName(), espresso.getPrice(), 1,
                    espresso.calcProductTotal(espresso.getPrice(), 1)));
            System.out.println("\t" + String.format("Macchiato: (Add $1) %-15s Extra Shot: %s", espresso.extraShot, espresso.macchiato));
        }
        else if(espresso.extraShot == false && espresso.macchiato == true){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    espresso.getName(), espresso.getPrice(), 1,
                    espresso.calcProductTotal(espresso.getPrice(), 1)));
            System.out.println("\t" + String.format("Macchiato: %-15s Extra Shot: (Add $2) %s", espresso.extraShot, espresso.macchiato));
        }
        else if(espresso.extraShot == true && espresso.macchiato == true){
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    espresso.getName(), espresso.getPrice(), 1,
                    espresso.calcProductTotal(espresso.getPrice(), 1)));
            System.out.println("\t" + String.format("Macchiato: (Add $1) %-15s Extra Shot: (Add $2) %s", espresso.extraShot, espresso.macchiato));
        }
        else{
            System.out.println(String.format("Item: %-10s Price: %-10.2f Qty: %-10d Subtotal: %-10.2f",
                    espresso.getName(), espresso.getPrice(), 1,
                    espresso.calcProductTotal(espresso.getPrice(), 1)));
            System.out.println("\t" + String.format("Macchiato: %-15s Extra Shot: %s", espresso.extraShot, espresso.macchiato));
        }
        return output;
    }


}
