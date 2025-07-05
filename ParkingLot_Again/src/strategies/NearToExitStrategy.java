package strategies;

import parking.ParkingSpot;

import java.util.List;

public class NearToExitStrategy {

    public ParkingSpot findSpot(List<ParkingSpot> parkingSpotList){
        return parkingSpotList.get(1);
    }

}
