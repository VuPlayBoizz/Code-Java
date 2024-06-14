package INHERITANCE006;

class Animal{
    public int legs;

    public Animal(int legs){
        this.legs = legs;
    }

    public void walk(){
        System.out.println("This animal walks on " + legs +" legs.");  
    }

    public void eat(){};
}

interface Pet{
    public String getName();
    public void setName(String name);
    public void play();
}

class Spider extends Animal{
    public Spider(int legs){
        super(legs);
    }

    public void eat(){
        System.out.println("The spider eats a fly.");
    }
}

class Fish extends Animal implements Pet{
    private String name;
    
    public Fish(int legs){
        super(legs);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void play(){
        System.out.println("Fish swim in their tanks all day.");
    }

    public void walk(){
        System.out.println("This animal walks on "+ legs + " legs.");
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }
}

class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name, int legs){
        super(legs);
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void play(){
        System.out.println(name + " likes to play with string.");
    }

    public void eat(){
        System.out.println("Cats like to eat spiders and mice.");
    }
}

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish(0);
        fish.play();
        fish.walk();

        Cat cat = new Cat("Fluffy", 4);
        cat.play();
        cat.eat();
        
        Spider spider = new Spider(8);
        spider.eat();

        cat.walk();
        spider.walk();
    }
}
