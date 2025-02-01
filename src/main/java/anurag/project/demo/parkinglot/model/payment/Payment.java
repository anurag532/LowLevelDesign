package anurag.project.demo.parkinglot.model.payment;

import anurag.project.demo.parkinglot.model.exceptions.PaymentFailedException;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class Payment {

    int paymentId;
    Date paymentDate;
    boolean isPaymentDone;

    public Payment(int paymentId,Date paymentDate, boolean isPaymentDone){
        this.paymentId=paymentId;
        this.paymentDate=paymentDate;
        this.isPaymentDone=isPaymentDone;
    }

    public abstract void makePayment()throws PaymentFailedException;
}
