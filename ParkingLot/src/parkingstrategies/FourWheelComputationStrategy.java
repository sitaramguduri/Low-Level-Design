package parkingstrategies;

import Types.VehicleType;
import parking.ParkingSpot;
import parking.Ticket;
import parking.Vehicle;

import java.util.Date;

public class FourWheelComputationStrategy extends  CostComputationStrategy{
    public int costCompute(Ticket ticket){
        Date now = new Date();
        long timeDiff = now.getTime() - ticket.getStartTime().getTime();
        return (int) timeDiff*4;
    }
}
