import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
           StringBuffer s = new StringBuffer(sc.nextLine());
            System.out.println(s.length());
        }
    }
}