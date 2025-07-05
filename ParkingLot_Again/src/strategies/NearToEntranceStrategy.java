package strategies;

import parking.ParkingSpot;

import java.util.List;

public class NearToEntranceStrategy implements ParkingStrategy{

    public ParkingSpot findSpot(List<ParkingSpot> parkingSpotList){
        return parkingSpotList.get(0);
    }

}
