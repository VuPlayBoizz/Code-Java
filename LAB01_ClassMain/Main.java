package LAB01_ClassMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Test = sc.nextInt();
        sc.nextLine();

        while(Test != 0){
            String input = sc.nextLine();
            int lenght = input.length();

            String[] words = input.split(" ");
            int num_of_words = words.length;

            System.out.println(lenght + " " + num_of_words);
            Test--; 
        }
    }
}
