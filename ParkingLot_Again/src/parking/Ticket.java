package parking;

import java.time.LocalDateTime;

public class Ticket {
    private final int ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final int gateId;
    private final LocalDateTime entryTime;

    public Ticket(int ticketId, Vehicle vehicle, ParkingSpot spot, int gateId, LocalDateTime entryTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.gateId = gateId;
        this.entryTime = entryTime;
    }

    public Ticket(Vehicle vehicle, ParkingSpot spot, int gateId, LocalDateTime entryTime) {
        this.ticketId = -1; // can be assigned by controller
        this.vehicle = vehicle;
        this.spot = spot;
        this.gateId = gateId;
        this.entryTime = entryTime;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public int getGateId() {
        return gateId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
