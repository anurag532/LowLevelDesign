package anurag.project.demo.parkinglot.model;

import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import anurag.project.demo.parkinglot.model.payment.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class Bill {

    Timestamp exitTime;
    int amount;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    Payment payment;
}
