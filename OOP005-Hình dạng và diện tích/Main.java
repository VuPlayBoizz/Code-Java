import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name){
        this.name = name;
    }

    abstract double calculateArea();

    public void displayInfo(){
        System.out.printf("Shape:%s|Area:%.2f\n", name, calculateArea());
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t -- > 0){
            String input = sc.nextLine();
            String[] words = input.split(" ");
            if(words[0].equals("Circle")){
                Circle c = new Circle(words[0], Double.parseDouble(words[1]));
                c.displayInfo();
            }else{
                Rectangle r = new Rectangle(words[0], Double.parseDouble(words[1]), Double.parseDouble(words[2]));
                r.displayInfo();
            }
        }
    }
}
