package anurag.project.demo.parkinglot.controller;

import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import anurag.project.demo.parkinglot.model.parkingstrategy.DefaultParkingSpotStrategy;
import anurag.project.demo.parkinglot.model.parkingstrategy.FindParkingSpotStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TwoWheelerPSController extends ParkingSpotController {
    public TwoWheelerPSController(List<ParkingSpot> parkingSpotList,FindParkingSpotStrategy findParkingSpotStrategy) {
        super(parkingSpotList,new DefaultParkingSpotStrategy());
    }
}
