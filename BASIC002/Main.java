import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        sc.nextLine();
        while(Test > 0){
            String input = sc.nextLine();
            System.out.printf(input + "\n");
            Test--;
        }
    }
}