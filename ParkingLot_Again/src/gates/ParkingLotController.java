package gates;

import parking.Ticket;
import parking.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotController {
    private final Map<Integer, EntranceGates> entranceGates = new HashMap<>();
    private final Map<Integer, ExitGate> exitGates = new HashMap<>();

    public void registerEntranceGate(EntranceGates gate) {
        entranceGates.put(gate.getGateId(), gate);
    }

    public void registerExitGate(ExitGate gate) {
        exitGates.put(gate.getGateId(), gate);
    }

    public Ticket enterVehicle(int gateId, Vehicle vehicle) {
        EntranceGates gate = entranceGates.get(gateId);
        return gate.generateTicket(vehicle);
    }

    public int exitVehicle(int gateId, Ticket ticket) {
        ExitGate gate = exitGates.get(gateId);
        int cost = gate.computeCost(ticket);
        gate.removeVehicle(ticket.getSpot());
        return cost;
    }
}

