package anurag.project.demo.parkinglot.model.parkingstrategy;

import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import anurag.project.demo.parkinglot.model.exceptions.ParkingSpotNotFoundException;

import java.util.List;

public class DefaultParkingSpotStrategy implements FindParkingSpotStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) throws ParkingSpotNotFoundException {
        return parkingSpotList.stream().filter(ParkingSpot::isAvailable).findAny().orElseThrow(() -> new ParkingSpotNotFoundException("No parking spot found"));

    }
}
