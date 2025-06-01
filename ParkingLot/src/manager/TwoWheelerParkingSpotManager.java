package manager;

import parking.ParkingSpot;
import parking.TwoWheelerParkingSpot;
import parkingstrategies.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

    public TwoWheelerParkingSpotManager(List<ParkingSpot> list, ParkingStrategy parkingStrategy){
        super(list,parkingStrategy);
    }
}
