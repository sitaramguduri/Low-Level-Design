package parkingstrategies;

import parking.ParkingSpot;

import java.util.List;

public class NearToEntrance implements ParkingStrategy{


    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList){
        //some strategy to find Parking spot we can use heap
        System.out.println("ParkingSpot has been found");
        return parkingSpotList.get(0);
    }
}
