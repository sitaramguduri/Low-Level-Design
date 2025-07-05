package parking;

import manager.FourWheelerParkingSpotManager;
import manager.ParkingSpotManager;
import manager.TwoWheelerParkingSpotManager;
import strategies.ParkingStrategy;
import types.VehicleType;

import java.util.List;

public class ParkingManagerFactory {

    public ParkingSpotManager createFactory(String type, List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy){
        if(type.equals(VehicleType.TWO)){
            return new TwoWheelerParkingSpotManager(parkingSpotList, parkingStrategy);
        }else{
            return new FourWheelerParkingSpotManager(parkingSpotList, parkingStrategy);
        }
    }
}
