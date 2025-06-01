package parkingstrategies;

import parking.ParkingSpot;
import parking.Ticket;
import parking.Vehicle;

import java.util.Date;

public class TwoWheelComputationStrategy extends CostComputationStrategy{
    public int costCompute( Ticket ticket){
        Date now = new Date();
        long timeDiff = now.getTime() - ticket.getStartTime().getTime();
        return (int) timeDiff*2;
    }
}
