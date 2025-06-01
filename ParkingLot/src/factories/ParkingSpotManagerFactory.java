package factories;

import Types.VehicleType;
import manager.FourWheelereParkingSpotManager;
import manager.ParkingSpotManager;
import manager.TwoWheelerParkingSpotManager;
import parking.ParkingSpot;
import parking.Vehicle;
import parkingstrategies.ParkingStrategy;

import java.util.List;

public class ParkingSpotManagerFactory {

    public ParkingSpotManager createFactory(Vehicle vehicle, List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy){
        System.out.println("vehicle type: " + vehicle.getVehicleType());
        if(vehicle.getVehicleType() == VehicleType.TWO){
            System.out.println("parkingspotmanager generation");
            return new TwoWheelerParkingSpotManager(parkingSpots, parkingStrategy);
        }else if(vehicle.getVehicleType() == VehicleType.FOUR){
            return new FourWheelereParkingSpotManager(parkingSpots, parkingStrategy);
        }else{
            return null;
        }

    }
}
