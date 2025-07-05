package parking;

import types.VehicleType;

public class FourWheelerParkingSpot extends ParkingSpot{

    public FourWheelerParkingSpot(int id, int price){
        super(id, VehicleType.FOUR, price);
    }
}
