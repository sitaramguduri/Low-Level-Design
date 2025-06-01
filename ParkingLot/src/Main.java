import Types.VehicleType;
import factories.ParkingSpotManagerFactory;
import gates.EntranceGate;
import gates.ExitGate;
import manager.ParkingSpotManager;
import parking.ParkingSpot;
import parking.TwoWheelerParkingSpot;
import parking.Vehicle;
import parkingstrategies.NearToEntrance;
import parkingstrategies.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //we need to generate a list of parkingSpots
        List<ParkingSpot> TwoWheelerParkingSpotList = new ArrayList<>();
        for(int i = 0; i<10;i++ ){
            TwoWheelerParkingSpotList.add(new TwoWheelerParkingSpot(i));
        }

        Vehicle vehicle = new Vehicle(1111, VehicleType.TWO);
        //we need to have a parking Strategy for the Two Wheelers
        ParkingStrategy nearStrategy = new NearToEntrance();
        ParkingSpotManagerFactory parkingSpotManagerFactory  = new ParkingSpotManagerFactory();
        EntranceGate entranceGate = new EntranceGate(parkingSpotManagerFactory);
        ParkingSpotManager parkingSpotManager = entranceGate.createParkingSpotManager(vehicle,nearStrategy,TwoWheelerParkingSpotList);

        System.out.println("check parking spot isEmpty:" + TwoWheelerParkingSpotList.get(0).isEmpty());
        ParkingSpot vehicleSpot = parkingSpotManager.findParkingSpot();
        vehicleSpot.parkVehicle();
        System.out.println("check parking spot isEmpty:" + TwoWheelerParkingSpotList.get(0).isEmpty());
        entranceGate.generateTicket(vehicle, nearStrategy,vehicleSpot);
        parkingSpotManager.parkVehicle(vehicleSpot);//vehicle is parked

        ExitGate exitGate = new ExitGate(entranceGate.getTicket(),parkingSpotManager);
        int cost = exitGate.getCost();
        System.out.println("ticket cost: "+ cost);
        exitGate.payTicket();;
        exitGate.emptyParkingSpot(vehicleSpot);



    }
}