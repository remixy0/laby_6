package Zad5;

import javax.swing.plaf.ComponentInputMapUIResource;

public class Main5 {
    public static void main(String[] args) {
        PaymentMethod [] paymentMethods = new PaymentMethod[4];
        paymentMethods[0] = new CreditCard(124.2);
        paymentMethods[1] = new Blik(124.2);
        paymentMethods[2] = new PayPal(124.2);
        paymentMethods[3] = new CryptoTransfer();

        paymentMethods[0].process(200.21);
        paymentMethods[1].process(100.43);
        paymentMethods[2].process(22.13);
        paymentMethods[3].process(992.12);



    }
}
