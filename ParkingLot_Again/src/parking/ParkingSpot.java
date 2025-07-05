package parking;

import types.VehicleType;

public class ParkingSpot {
    int id;
    int vehicle;
    boolean isEmpty;
    VehicleType vehicleType;
    int price;
    public ParkingSpot(int id, VehicleType vehicleType, int price){
        this.id = id;
        this.vehicleType = vehicleType;
        this.price = price;

    }

    public void parkVehicle(){
        System.out.println("vehicle parked");
        isEmpty = false;

    }
    public boolean removeVehicle(){
        System.out.println("vehicle removed");
        isEmpty = true;
        return isEmpty;
        // how to handle errors: try catch!!!
    }

}
