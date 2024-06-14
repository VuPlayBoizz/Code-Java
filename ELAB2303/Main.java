package ELAB2303;

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
    }
    public boolean equals(MyStuff a){
        if(name.equals(a.name)) return true;
        return false;
    }
    
    public boolean check(MyStuff a){
        if(a.name == name) return true;
        return false;
    }
    
}
public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        

        if (m2.equals(m1))
            System.out.println("value compared: same");
        else
            System.out.println("value compared: different");


        if (!m2.check(m1))
            System.out.println("reference compared: same");
        else
            System.out.println("reference compared: different");
    }
}
