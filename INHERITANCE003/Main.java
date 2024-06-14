package INHERITANCE003;

import java.util.ArrayList;

class Item{
    private String name;
    private double price;
    private double discount;

    public Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice(){
        return price;
    }

    public double getDiscount(){
        return discount;
    }

    public String toString(){
        return this.name + "$" + this.price + "(-$" + this.discount +")";
    }
}

class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class GroceryBill{
    protected Employee clerk;
    protected ArrayList<Item> receipt;
    protected double total;

    public GroceryBill(Employee clerk){
        this.clerk = clerk;
    }

    public void add(Item i){
        this.receipt.add(i);
        this.total += i.getPrice();
    }

    public double getTotal(){
        return total;
    }

    public Employee getClerk(){
        return clerk;
    }

    public String toString(){
        return
    }
}

public class Main {
    
}
