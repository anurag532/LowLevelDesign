package anurag.project.demo.parkinglot.model.bill;

import anurag.project.demo.parkinglot.model.Ticket;

import java.sql.Timestamp;

public class HourlyBasedBillCalculator implements BillCalculator{
    @Override
    public int calculateBill(Ticket ticket, Timestamp exitTime) {
        return 10;
    }
}
