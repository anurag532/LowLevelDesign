package anurag.project.demo.parkinglot.model.bill;

import anurag.project.demo.parkinglot.enums.VehicleType;

public class BillCalculatorFactory {

    public BillCalculator getBillCalculator(VehicleType vehicleType){

        if(VehicleType.TWO_WHEELER.equals(vehicleType)){
            return new MinuteBasedBillCalculator();
        }
        else{
            return new HourlyBasedBillCalculator();
        }
    }
}
