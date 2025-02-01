package anurag.project.demo.parkinglot.model;

import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    Timestamp entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
}
