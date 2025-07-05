package gates;

import manager.ParkingSpotManager;
import parking.ParkingManagerFactory;
import parking.ParkingSpot;
import parking.Ticket;
import parking.Vehicle;
import types.VehicleType;

import java.time.LocalDateTime;

public class EntranceGates extends Gate {
    public EntranceGates(int id, ParkingSpotManager spotManager){
        super(id, spotManager);
    }
    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpot spot = spotManager.allocateSpot();
        spotManager.addVehicle(spot);
        return new Ticket(vehicle, spot, gateId, LocalDateTime.now());
    }
}

