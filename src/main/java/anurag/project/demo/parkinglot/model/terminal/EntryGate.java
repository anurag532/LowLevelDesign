package anurag.project.demo.parkinglot.model.terminal;

import anurag.project.demo.parkinglot.controller.ParkingSpotController;
import anurag.project.demo.parkinglot.model.exceptions.ParkingSpotNotFoundException;
import anurag.project.demo.parkinglot.model.Ticket;
import anurag.project.demo.parkinglot.model.Vehicle;
import anurag.project.demo.parkinglot.model.parkingspots.ParkingSpot;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class EntryGate implements Terminal{
    int entryGateId;
    ParkingSpotController parkingSpotController;
    List<ParkingSpot> bookedParkingSpots;
    List<Ticket> bookedTickets;

    public EntryGate(int entryGateId,ParkingSpotController parkingSpotController){
        this.entryGateId=entryGateId;
        this.parkingSpotController=parkingSpotController;
    }

    @Override
    public int getTerminalId() {
        return this.entryGateId;
    }
    public ParkingSpot findParkingSpot(){
        try{return parkingSpotController.findParkingSpot();}
        catch ( ParkingSpotNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public void parkTheVehicle(Vehicle vehicle, Ticket ticket){
        ParkingSpot parkingSpot = parkingSpotController.parkTheVehicle(vehicle,findParkingSpot());
        bookedParkingSpots.add(parkingSpot);
    }
    public void generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        Ticket ticket=new Ticket(Timestamp.valueOf(LocalDateTime.now()),vehicle,parkingSpot);
        bookedTickets.add(ticket);
    }

}
