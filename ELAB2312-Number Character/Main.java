import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int Count = 0;
            String in = sc.nextLine();
            for (int i = 0; i < in.length(); i++) {
                if(in.charAt(i) >= '0' && in.charAt(i) <= '9'){
                    Count++;
                }
            }
            System.out.println(Count);
        }
    }
}