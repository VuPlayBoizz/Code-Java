package OOP015;
import java.util.Scanner;

class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.name + " - " + this.address;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        sc.nextLine();

        while (Test != 0) {
            String name = sc.nextLine();
            String address = sc.nextLine();
            Person P = new Person(name, address);
            System.out.println(P.toString());
            Test--;
        }
    }
}
