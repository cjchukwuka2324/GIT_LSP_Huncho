package org.howard.edu.lsp.oopfinal.question2;

public class BitCoinPayment implements PaymentStrategy {

private String bitcoinAddress;

public BitCoinPayment(String bitcoinAddress) {
this.bitcoinAddress = bitcoinAddress;
}

@Override
public void pay(double pay) {
System.out.println("Paid " + String.valueOf(pay) + " using Bitcoin address " + bitcoinAddress);

}

}