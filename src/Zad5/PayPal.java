package Zad5;

public class PayPal implements PaymentMethod{
    double balance;
    public PayPal(double balance){
        this.balance = balance;
    }
    @Override
    public boolean process(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
