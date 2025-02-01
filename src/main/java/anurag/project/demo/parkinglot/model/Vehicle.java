package anurag.project.demo.parkinglot.model;

import anurag.project.demo.parkinglot.enums.VehicleType;
import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
   String vehicleNumber;
   ParkingSpot parkingSpot;
   VehicleType vehicleType;
}
