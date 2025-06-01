package parkingstrategies;

import Types.VehicleType;
import parking.ParkingSpot;
import parking.Ticket;
import parking.Vehicle;

public abstract class CostComputationStrategy {
    public abstract int costCompute(Ticket ticket);
}
