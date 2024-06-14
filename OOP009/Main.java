package OOP009;

import java.util.Scanner;

class Point{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double Slope(Point other){
        if(this.x == other.x)    return -1;
        else{
            double res = (double)(other.y - this.y) / (other.x - this.x);
            return res == -0.0 ? 0.0 : res;
        }
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Test = sc.nextInt();
        while(Test != 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            Point a = new Point(x1, y1);

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Point b = new Point(x2, y2);

            double ans = a.Slope(b);
            System.out.println(ans);
            Test--;
        }        
    }
}
