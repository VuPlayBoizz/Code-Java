import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Test = sc.nextInt();
        sc.nextLine();

        while(Test != 0) {
            String input = sc.nextLine();
            String[] split = input.split("\\s+");

            BigInteger a = new BigInteger(split[0]);
            BigInteger b = new BigInteger(split[2]);

            if(split[1].equals("+")){
                BigInteger Add = a.add(b);
                System.out.println(Add);
            }else if(split[1].equals("-")){
                BigInteger Sub = a.subtract(b);
                System.out.println(Sub);
            }else{
                BigInteger Mul = a.multiply(b);
                System.out.println(Mul);
            }
            Test--;
        }
        sc.close();
    }
}
