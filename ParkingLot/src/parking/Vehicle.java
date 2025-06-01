package parking;

import Types.VehicleType;

public class Vehicle {
    int vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(int vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        System.out.println("A new vehicle is created :" + this.vehicleType + this.vehicleNumber);
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
