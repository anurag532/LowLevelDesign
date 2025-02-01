package anurag.project.demo.parkinglot.model.parkingstrategy;

import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import anurag.project.demo.parkinglot.model.exceptions.ParkingSpotNotFoundException;

import java.util.List;

public interface FindParkingSpotStrategy {

    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) throws ParkingSpotNotFoundException;
}
