package gates;

import factories.CostComputationFactory;
import factories.ParkingSpotManagerFactory;
import manager.ParkingSpotManager;
import parking.ParkingSpot;
import parking.Ticket;
import parkingstrategies.CostComputationStrategy;

public class ExitGate {
    Ticket t;
    CostComputationStrategy costComputationStrategy;
//    CostComputationFactory costComputationFactory;
//    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    public ExitGate(Ticket t, ParkingSpotManager parkingSpotManager){
        this.t = t;
        costComputationStrategy = new CostComputationFactory().createFactory(t.getVehicle());
        this.parkingSpotManager = parkingSpotManager;
    }
    public int getCost(){
        return costComputationStrategy.costCompute(t);
    }
    public void emptyParkingSpot(ParkingSpot parkingSpot){
        parkingSpotManager.removeParkingSpot(parkingSpot);
    }
    public void payTicket(){
        System.out.println("Payment done");
    }


}
