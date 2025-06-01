package manager;

import parking.ParkingSpot;
import parkingstrategies.ParkingStrategy;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> list;
    ParkingStrategy parkingStrategy;
    ParkingSpotManager(List<ParkingSpot> list, ParkingStrategy parkingStrategy){
        this.list = list;
        this.parkingStrategy = parkingStrategy;
    }
    //
    public void parkVehicle(ParkingSpot parkingSpot){
        parkingSpot.parkVehicle();
    }
    public void removeVehicle(ParkingSpot parkingSpot){
        parkingSpot.removeVehicle();
    }
    public void addParkingSpot(ParkingSpot newParkingSpot){
        list.add(newParkingSpot);
    }
    public void removeParkingSpot(ParkingSpot parkingSpot){

        list.remove(parkingSpot);

    }
    public ParkingSpot findParkingSpot(){
        return parkingStrategy.findParkingSpot(list);
    }

}
