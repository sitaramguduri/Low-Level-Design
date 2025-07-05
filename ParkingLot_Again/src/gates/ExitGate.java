package gates;

import manager.ParkingSpotManager;
import parking.ParkingSpot;
import parking.Ticket;
import strategies.CostComputeStrategies;

import java.time.LocalDateTime;
import java.time.Duration;

public class ExitGate extends Gate {
    public ExitGate(int gateId, ParkingSpotManager spotManager) {
        super(gateId, spotManager);
    }

    public int computeCost(Ticket ticket) {
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
//        return CostComputeStrategies.compute(ticket.getVehicle().getType(), duration);
        return 25;
    }

    public void removeVehicle(ParkingSpot spot) {
        spotManager.removeVehicle(spot);
    }
}
