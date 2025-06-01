package parkingstrategies;

import parking.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList);
}
