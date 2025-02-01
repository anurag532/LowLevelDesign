package anurag.project.demo.parkinglot.model.parkingspots;

import anurag.project.demo.parkinglot.model.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ParkingSpot {

    int parkingSpotId;
    boolean isAvailable;
    Vehicle vehicle;
    int priceOfTheSpot;

    public ParkingSpot(int parkingSpotId, boolean isAvailable, Vehicle vehicle, int priceOfTheSpot) {
        this.parkingSpotId = parkingSpotId;
        this.isAvailable = isAvailable;
        this.vehicle = vehicle;
        this.priceOfTheSpot = priceOfTheSpot;
    }
}
