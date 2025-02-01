package anurag.project.demo.parkinglot.model.terminal;

import anurag.project.demo.parkinglot.controller.ParkingSpotController;
import anurag.project.demo.parkinglot.model.Bill;
import anurag.project.demo.parkinglot.model.exceptions.PaymentFailedException;
import anurag.project.demo.parkinglot.model.Ticket;
import anurag.project.demo.parkinglot.model.bill.BillCalculator;
import anurag.project.demo.parkinglot.model.bill.BillCalculatorFactory;
import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import anurag.project.demo.parkinglot.model.payment.Payment;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class ExitGate implements Terminal {

    int exitGateId;
    BillCalculatorFactory billCalculatorFactory;
    List<Payment> successfulPayments;
    List<Payment> failedPayments;
    List<Bill> billsGeneratedSoFar;
    ParkingSpotController parkingSpotController;

    public ExitGate(int exitGateId,BillCalculatorFactory billCalculatorFactory,ParkingSpotController parkingSpotController){
        this.exitGateId=exitGateId;
        this.billCalculatorFactory=billCalculatorFactory;
        this.parkingSpotController=parkingSpotController;
    }
    @Override
    public int getTerminalId() {
        return this.exitGateId;
    }

    public void calculatePrice(Ticket ticket, Timestamp exitTime){
        BillCalculator billCalculator = billCalculatorFactory.getBillCalculator(ticket.getVehicle().getVehicleType());
        int totalAmount = billCalculator.calculateBill(ticket, Timestamp.valueOf(LocalDateTime.now()));
        Bill generatedBill = new Bill(exitTime, totalAmount, ticket.getVehicle(), ticket.getParkingSpot(), null);
    }

    public boolean makePayment(Bill bill, Payment payment) {
        try {
            payment.makePayment();
            successfulPayments.add(payment);
            bill.setPayment(payment);
            billsGeneratedSoFar.add(bill);
            return true;
        } catch (PaymentFailedException e) {
            failedPayments.add(payment);
            return false;
        }
    }

    public void clearTheParkingSpot(ParkingSpot parkingSpot){
        parkingSpotController.clearParkingSport(parkingSpot);
    }
}
