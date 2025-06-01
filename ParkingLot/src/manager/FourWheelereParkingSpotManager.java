package manager;

import parking.ParkingSpot;
import parkingstrategies.ParkingStrategy;

import java.util.List;

public class FourWheelereParkingSpotManager extends ParkingSpotManager{
    public FourWheelereParkingSpotManager(List<ParkingSpot> list,  ParkingStrategy parkingStrategy){
        super(list,parkingStrategy);
    }
}
