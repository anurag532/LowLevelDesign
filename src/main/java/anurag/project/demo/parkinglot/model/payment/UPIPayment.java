package anurag.project.demo.parkinglot.model.payment;

import anurag.project.demo.parkinglot.model.exceptions.PaymentFailedException;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UPIPayment extends Payment{
    String upiId;
    public UPIPayment(int paymentId, Date paymentDate, boolean isPaymentDone){
        super(paymentId,paymentDate,isPaymentDone);
    }
    @Override
    public void makePayment() throws PaymentFailedException {

    }
}
