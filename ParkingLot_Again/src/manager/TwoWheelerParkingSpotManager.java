package manager;

import parking.ParkingSpot;
import strategies.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    public TwoWheelerParkingSpotManager (List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy){
        super(parkingSpotList, parkingStrategy);
    }
}
