package Zad5;

public class Blik implements PaymentMethod{
    double balance;
    public Blik(double balance){
        this.balance = balance;
    }
    @Override
    public boolean process(double amount) {
        if(balance < amount && amount > 0){
            balance -= amount;
            return true;
        }
        return false;
    }
}
