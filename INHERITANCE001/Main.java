//package INHERITANCE001;

class Person{
    protected String name;
    protected String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.name + " - " + this.address;
    }
}

class Student extends Person{
    private static int credit = 0; 

    public Student(String name, String address){
        super(name, address);
    }

    public void study(){
        credit++;
    }

    public int getCredits(){
        return credit;
    }
}

public class Main {
    public static void main(String[] args) {
       Student s1 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
       System.out.println( s1.toString());
       System.out.println("Study credits " + s1.getCredits());
       s1.study();
       System.out.println("Study credits " + s1.getCredits());
    }
}
