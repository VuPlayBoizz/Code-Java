import java.util.Scanner;

class Person{
    String name;
    int age;
    
    public Person(String name, int age) throws Exception{
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new Exception("Name is not valid");
        }
        if(age < 0 || age > 120){
            throw new Exception("Age is not valid");
        }
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + "--Age:" + age;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            try{
                Person p = new Person(name, age);
                System.out.println(p);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}