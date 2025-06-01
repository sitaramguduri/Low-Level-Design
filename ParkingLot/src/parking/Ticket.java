package parking;

import java.util.Date;

public class Ticket {
    Date startTime;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle){
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.startTime = new Date();
    }


    public void generateTicket(ParkingSpot parkingSpot, Vehicle vehicle){
        System.out.println("Ticket is generated using " + parkingSpot + vehicle);
    }
    public Vehicle getVehicle(){
        return vehicle;
    }

    public Date getStartTime() {
        return startTime;
    }
}
