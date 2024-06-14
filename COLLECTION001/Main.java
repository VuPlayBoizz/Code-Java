package COLLECTION001;

import java.util.HashMap;

class Warehouse{
    private HashMap<String, Integer> product;

    public Warehouse(){
        this.product = new HashMap<>();
    }

    public void addProduct(String product, int stock){
        this.product.put(product, stock);
    }

    public int stock(String product){
        if(this.product.containsKey(product)){
            return this.product.get(product);
        }
        return -99;
    }
}

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 10);
        warehouse.addProduct("coffee", 7);
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.stock("milk"));
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
