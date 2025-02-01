package anurag.project.demo.parkinglot.controller;

import anurag.project.demo.parkinglot.model.exceptions.ParkingSpotNotFoundException;
import anurag.project.demo.parkinglot.model.Vehicle;
import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import anurag.project.demo.parkinglot.model.parkingstrategy.FindParkingSpotStrategy;

import java.util.List;

public abstract class ParkingSpotController {

    List<ParkingSpot> totalParkingSpots;
    List<ParkingSpot> bookedParkingSpots;
    FindParkingSpotStrategy findParkingSpotStrategy;

    public ParkingSpotController(List<ParkingSpot> totalParkingSpots,FindParkingSpotStrategy findParkingSpotStrategy) {
        this.totalParkingSpots=totalParkingSpots;
        this.findParkingSpotStrategy = findParkingSpotStrategy;
    }

    public ParkingSpot findParkingSpot() throws ParkingSpotNotFoundException {
        return findParkingSpotStrategy.findParkingSpot(totalParkingSpots);
    }

    public ParkingSpot parkTheVehicle(Vehicle vehicle,ParkingSpot parkingSpot){
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setAvailable(false);
        vehicle.setParkingSpot(parkingSpot);
        return parkingSpot;
    }
    public void clearParkingSport(ParkingSpot parkingSpot){
        bookedParkingSpots.remove(parkingSpot);
        //If not based on status of object we can do in parking spot list. And change isAvailable=false. And avoid creating bookedPSList
    }
}
