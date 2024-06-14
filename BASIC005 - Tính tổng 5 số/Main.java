import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        sc.nextLine();
        while(Test > 0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int num5 = sc.nextInt();
            long Sum = num1 + num2 + num3 + num4 + num5;
            System.out.println(Sum);
            Test--;
        }
    }
}