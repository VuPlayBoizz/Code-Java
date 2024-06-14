package OBJECT_REFERENCES002;

class SimpleDate{
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object o){
        if(o instanceof SimpleDate){
            SimpleDate a = (SimpleDate) o;
            if(this.day == a.day && this.month == a.month && this.year == a.year)   return true;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        if(d.equals("heh")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(d.equals(new SimpleDate(5, 2, 2012))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(d.equals(new SimpleDate(1, 2, 2000))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
