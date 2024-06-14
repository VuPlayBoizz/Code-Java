import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String input = sc.nextLine();
            String longestWord = findLongestWord(input);
            System.out.println(longestWord);
        }
    }

    public static String findLongestWord(String sentences){
        String[] parts = sentences.split(" ");
        String longestWord = "";
        for(String word : parts){
            if(word.length() >= longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
}