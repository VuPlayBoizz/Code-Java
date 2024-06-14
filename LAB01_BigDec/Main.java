package LAB01_BigDec;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String input = sc.nextLine();
            String[] num = input.split(" ");
            BigDecimal sum = new BigDecimal(0);

            for (int i = 0; i < num.length; i++) {
                String[] R = num[i].split("\\.");
                sum = sum.add(new BigDecimal(num[i]).subtract(new BigDecimal(R[0])));
            }
            System.out.println(sum);
        }
    }
}
