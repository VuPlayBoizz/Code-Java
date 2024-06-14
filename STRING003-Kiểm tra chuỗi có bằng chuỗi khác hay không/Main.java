import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while(t-- > 0){
            String s1 = sc.nextLine().toLowerCase();
            String s2 = sc.nextLine().toLowerCase();
            if(s1.equals(s2)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
