import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    public double distancePoint(Point p){
        return  Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t --> 0) {
            Point a = new Point(sc.nextInt(), sc.nextInt());
            Point b = new Point(sc.nextInt(), sc.nextInt());
            a.move(1, 1);
            System.out.printf("%.2f\n", a.distancePoint(b));
        }
    }
}
