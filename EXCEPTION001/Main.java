package EXCEPTION001;

import java.util.*;

class Amount{
    String currency;
    int amount;

    //Constructor
    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void add(Amount amount) throws Exception{
        if(!this.currency.equals(amount.getCurrency())){
            throw new Exception("Currency doesn't match");
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String currency1 = sc.next();
            int amount1 = sc.nextInt();

            String currency2 = sc.next();
            int amount2 = sc.nextInt();

            Amount am1 = new Amount(currency1, amount1);
            Amount am2 = new Amount(currency2, amount2);
            
            try{
                am1.add(am2);
                System.out.println(amount1 + amount2);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}