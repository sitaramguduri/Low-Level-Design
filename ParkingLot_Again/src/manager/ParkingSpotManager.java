package manager;

import parking.ParkingSpot;
import strategies.ParkingStrategy;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy){
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }
    public void addParkingSpot(ParkingSpot parkingSpot){

    }
    public boolean removeParkingSpot(ParkingSpot parkingSpot){

        // return true;
        return  true;
    }
    public ParkingSpot allocateSpot(){
        ParkingSpot spot = parkingStrategy.findSpot(parkingSpotList);
        return spot;
    }

    public void removeVehicle(ParkingSpot parkingSpot){
        parkingSpot.removeVehicle();
    }
    public void addVehicle(ParkingSpot parkingSpot){
        parkingSpot.parkVehicle();
    }

}
