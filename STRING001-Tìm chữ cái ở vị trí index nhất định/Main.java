import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        while(t-- > 0){
            String input = sc.next();
            int index = sc.nextInt();
            System.out.println("The character at position " + index + " is " + input.charAt(index));
        }
    }
}