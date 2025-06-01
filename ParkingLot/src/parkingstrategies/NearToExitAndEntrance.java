package parkingstrategies;

import parking.ParkingSpot;

import java.util.List;

public class NearToExitAndEntrance {
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList){
        //some strategy to find Parking spot we can use heap
        return parkingSpotList.get(parkingSpotList.size()-1);
    }
}
