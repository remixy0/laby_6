package Zad5;

public class CryptoTransfer implements PaymentMethod{
    double credit;
    public CryptoTransfer(){
        credit = 123.5;
    }
    @Override
    public boolean process(double amount) {
        if(amount > credit || amount < 0){
            return false;
        }
        if(amount <= credit){
            amount -= credit;
            return true;
        }
        return false;
    }
}
