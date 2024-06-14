package ELAB2302;

import java.util.Scanner;

class Student{
    private String name;
    private int age;
    public static int numberOfStudent = 0;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        numberOfStudent ++;
    }

    public void display(){
        if(this.age >= 18)   System.out.println(this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            new Student(sc.nextLine(), Integer.parseInt(sc.nextLine())).display();
        }
        System.out.println(Student.numberOfStudent);
        sc.close();
    }
}
