package parking;

import types.VehicleType;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(int id, int price){
        super(id, VehicleType.TWO, price);
    }
}
