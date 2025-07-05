package gates;

import manager.ParkingSpotManager;
import parking.ParkingManagerFactory;
import parking.ParkingSpot;
import parking.Ticket;
import parking.Vehicle;
import types.VehicleType;

public class EntranceGates {

    // generate Ticket and find a spot for the vehicle.

    // it needs to get parking manager and find the parking spot
    Ticket ticket;
    ParkingManagerFactory factory;

    public EntranceGates(ParkingManagerFactory factory){
        this.factory = factory;
    }

    public void findParkingSpot(VehicleType vehicleType){
        // generate the parkingspotmanager using the factory
    }
    public void generateTicket(Vehicle vehicle, ParkingSpot spot){

    }
}
