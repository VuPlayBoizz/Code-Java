package OBEJCT_REFERENCES001;

import java.util.Scanner;

class Song{
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    public boolean equals(Song other){
        if(this.name.equals(other.name) && this.author.equals(other.author) && this.duration == other.duration) return true;    
        return false;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Test = sc.nextInt();
        sc.nextLine();
        while (Test != 0) { //Test-->0
            String s1 = sc.nextLine();
            String[] words1 = s1.split(" ");
            Song song1 = new Song(words1[0], words1[1], Integer.parseInt(words1[2]));

            String s2 = sc.nextLine();
            String[] words2 = s2.split(" ");
            Song song2 = new Song(words2[0], words2[1], Integer.parseInt(words2[2]));

            if(song1.equals(song2)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            Test --;
        }
    }
}
