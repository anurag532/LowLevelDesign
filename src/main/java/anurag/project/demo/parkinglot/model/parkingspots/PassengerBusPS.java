package anurag.project.demo.parkinglot.model.parkingspots;

import anurag.project.demo.parkinglot.model.Vehicle;

public class PassengerBusPS extends ParkingSpot{

    public PassengerBusPS(int parkingSpotId, boolean isAvailable, Vehicle vehicle, int priceOfTheSpot) {
        super(parkingSpotId, isAvailable, vehicle, priceOfTheSpot);
    }
}
