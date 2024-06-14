import java.util.ArrayList;

class Item {
    private String name;
    private int weight;

    public Item(String name) {
        this.name = name;
        this.weight = 0;
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

abstract class Box {
    abstract void add(Item item);
    abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Item item) {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        BoxWithMaxWeight box = new BoxWithMaxWeight(10);

        Item saludo = new Item("Saludo", 5);
        Item pirkka = new Item("Pirkka", 5);
        Item kopiLuwak = new Item("Kopi Luwak", 5);

        box.add(saludo);
        box.add(pirkka);
        box.add(kopiLuwak);

        System.out.println(box.isInBox(saludo));
        System.out.println(box.isInBox(pirkka)); 
        System.out.println(box.isInBox(kopiLuwak));
    }
}