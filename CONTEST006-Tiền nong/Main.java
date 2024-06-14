
class Money{
    private int euros;
    private int cent;

    public Money(int euros, int cent){
        this.euros = euros;
        this.cent = cent;
    }
    // Task 1
    public String toString(){
        return String.format("%d.%02de",euros,cent);
    }

    // Task 2
    public Money plus(Money added){
        int newCent = this.cent + added.cent;
        int newEuros = this.euros + added.euros + cent/100;
        cent %= 100;
        return new Money(newEuros, newCent);
    }

    // Task 3
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            return this.cent < compared.cent;
        } else {
            return false;
        }
    }

    //Task 4
    public Money minus(Money minus){
        int newEuros = this.euros - minus.euros;
        int newCents = this.cent - minus.cent;
        
        if(newEuros < 0){
            newEuros = 0;
            newCents = 0;
        }
        if(newCents < 0){
            newEuros--;
            newCents += 100;
        }
        return new Money(newEuros, newCents);
    }

}
public class Main {
    public static void main(String[] args) {
        Money a = new Money(10,8);
        Money b = new Money(5, 5);
        Money u = new Money(10, 0);
        Money y = new Money(3, 0);
        Money w = new Money(5,0);
        Money m = new Money(10, 0);
        Money n = new Money(3, 50);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.plus(b).toString());
        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));

        System.out.println(m.toString());
        System.out.println(n.toString());

        System.out.println(m.minus(n).toString());
        Money o = m.minus(n);
        System.out.println(o.minus(m).toString());
    }
}
