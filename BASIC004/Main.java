import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String S = sc.nextLine();
            System.out.println("Hi " + S);
            T--;
        }
    }
}