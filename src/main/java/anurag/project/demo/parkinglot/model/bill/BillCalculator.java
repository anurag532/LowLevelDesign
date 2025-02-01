package anurag.project.demo.parkinglot.model.bill;

import anurag.project.demo.parkinglot.model.Ticket;

import java.sql.Timestamp;

public interface BillCalculator {

    int calculateBill(Ticket ticket, Timestamp exitTime);
}
