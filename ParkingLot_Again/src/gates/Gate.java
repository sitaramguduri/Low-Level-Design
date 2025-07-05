package gates;

import manager.ParkingSpotManager;

public abstract class Gate {
     int gateId;
    protected ParkingSpotManager spotManager;
    public Gate(int gateId, ParkingSpotManager spotManager) {
        this.gateId = gateId;
        this.spotManager = spotManager;
    }
    public int getGateId(){
        return gateId;
    }

}

