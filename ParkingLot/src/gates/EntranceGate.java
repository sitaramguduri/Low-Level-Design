package gates;

import factories.ParkingSpotManagerFactory;
import manager.ParkingSpotManager;
import parking.ParkingSpot;
import parking.Ticket;
import parking.Vehicle;
import parkingstrategies.ParkingStrategy;

import java.util.List;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    Ticket ticket;
    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    public ParkingSpotManager createParkingSpotManager(Vehicle vehicle, ParkingStrategy parkingStrategy, List<ParkingSpot> parkingSpots){
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.createFactory(vehicle,parkingSpots,parkingStrategy);
        return parkingSpotManager;
    }
    public void generateTicket(Vehicle vehicle, ParkingStrategy parkingStrategy, ParkingSpot vehicleSpot){
//        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.createFactory(vehicle,parkingSpots,parkingStrategy);
        System.out.println("A ticket is generated");
        Ticket ticket = new Ticket(vehicleSpot,vehicle);
        this.ticket = ticket;

    }


}
