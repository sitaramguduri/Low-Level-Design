package gates;

import manager.ParkingSpotManager;
import parking.ParkingManagerFactory;
import parking.ParkingSpot;
import parking.Ticket;
import strategies.CostComputeStrategies;
import types.VehicleType;

public class ExitGates {
    // calcualate the pay and remove the vehicle from the spot
    CostComputeStrategies computeStrategies;
    ParkingSpotManager parkingSpotManager;

    // public
    public void computeCost(Ticket ticket){
        // compute cost here
    }
    public void removeVehicle(ParkingSpot parkingSpot){
        parkingSpotManager.removeParkingSpot(parkingSpot);
    }
}
