package anurag.project.demo.parkinglot.model.payment;

import anurag.project.demo.parkinglot.model.exceptions.PaymentFailedException;

import java.util.Date;

public class CreditCardPayment extends Payment{

    String cardNumber;
    Date expiryDate;
    String cvv;

    public CreditCardPayment(String cardNumber, Date expiryDate, String cvv, int paymentId, Date paymentDate, boolean isPaymentDone) {
        super(paymentId, paymentDate, isPaymentDone);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv=cvv;
    }

    @Override
    public void makePayment() throws PaymentFailedException {
        if(this.expiryDate.compareTo(new Date()) > 0){
            this.isPaymentDone=true;
            this.paymentDate=new Date();

        }
        else{
            throw new PaymentFailedException("Card is expired. Cannot process the payment.");
        }
    }
}
