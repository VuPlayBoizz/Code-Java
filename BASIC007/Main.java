import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            int year = sc.nextInt();
            if(year % 400 == 0){
                System.out.println(year + " : Leap-year");
            }
            else if(year % 4 == 0 && year % 100 != 0){
                System.out.println(year + " : Leap-year");
            }
            else{
                System.out.println(year + " : Non Leap-year");
            }
            T--;
        }
    }
}