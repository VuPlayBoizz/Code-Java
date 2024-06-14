package COLLECTION002;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String input = sc.nextLine();
            ArrayList<String> parts = new ArrayList<>(Arrays.asList(input.split(" ")));
            removeShorterStrings(parts);
            for(int i=0;i<parts.size()-1;i++){
                System.out.print(parts.get(i) + " ");
            }
            System.out.println(parts.get(parts.size()-1));
        }
    }

    public static void removeShorterStrings(ArrayList<String> list) {
        for(int i=0;i<list.size()-1;i+=2){
            if(list.get(i).length() <= list.get(i+1).length()){
                list.remove(i);
            }
            else {
                list.remove(i+1);
            }
        }
    }
}