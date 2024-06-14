package EXCEPTION003;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t -->0){
            String input = sc.nextLine();
            try{
                hasVowels(input);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void hasVowels(String str) throws Exception{
        if(str.matches(".*[aeiouAEIOU].*")){
            System.out.println("String has vowels");
        }else{
            throw new Exception("String not contain vowels");
        }
    }
}
