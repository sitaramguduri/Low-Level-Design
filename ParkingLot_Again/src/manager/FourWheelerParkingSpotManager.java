package manager;

import parking.FourWheelerParkingSpot;
import parking.ParkingSpot;
import strategies.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy){
        super(parkingSpotList, parkingStrategy);
    }

}
