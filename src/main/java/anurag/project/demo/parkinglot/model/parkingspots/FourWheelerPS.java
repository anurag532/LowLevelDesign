package anurag.project.demo.parkinglot.model.parkingspots;

import anurag.project.demo.parkinglot.model.Vehicle;

public class FourWheelerPS extends ParkingSpot{
    public FourWheelerPS(int parkingSpotId, boolean isAvailable, Vehicle vehicle, int priceOfTheSpot) {
        super(parkingSpotId, isAvailable, vehicle, priceOfTheSpot);
    }
}
