package OOP002;
import java.util.Scanner;

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        return   "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]"; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            System.out.println(new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }
}
