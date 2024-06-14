package POLYMORPHISM002;

import java.util.ArrayList;
import java.util.Scanner;

interface Moveable {
    public void move(int dx, int dy);
}

class Organism implements Moveable{
    private int x;
    private int y;
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public String toString() {
        return "x:" + this.x + "; y:" + this.y;
    }
}

class Herd implements Moveable{
    private ArrayList<Organism> organisms = new ArrayList<>();

    public void addToHerd(Moveable moveable){
        organisms.add((Organism) moveable);
    }

    public void move(int dx, int dy){
        for(Organism x : organisms){
            x.move(dx, dy);
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder("");
        for(Organism x : organisms){
            s.append(x);
        }
        return s.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Test = sc.nextInt();
        sc.nextLine();

        while(Test -->0){
            Herd herd = new Herd();
            herd.addToHerd(new Organism(sc.nextInt(), sc.nextInt()));
            herd.move(1, 1);
            System.out.println(herd);
        }
    }   
}
