package Zad5;

public class CreditCard implements PaymentMethod{
    double balance;

    public CreditCard(double balance){
        this.balance = balance;
    }

    @Override
    public boolean process(double amount) {
        if(amount <= balance && amount > 0){
            balance -= amount;
            return true;
        }
        return false;
    }
}
