package OOP001;

class BankAccount{
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id){
        this.id = id;
        this.balance = 0;
        this.transactions = 0;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getID(){
        return this.id;
    }

    public int getTransactions(){
        return this.transactions;
    }

    public void deposit(double amount){
        if(amount >= 0 && amount <= 500){
            this.balance += amount;
            this.transactions++;
        }
    }

    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            this.transactions ++;
        }
    }

    public boolean transactionFee(double amount){
        double sum = 0;
        for(int i = 1; i <= this.transactions; i++){
            sum+= amount * i;
        }

        if(this.balance >= sum){
            this.balance -= sum;
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        System.out.println(savings.transactionFee(5.00));
        System.out.println(savings.transactionFee(10.00));
    }
}
