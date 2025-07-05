package strategies;

import parking.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {

    public ParkingSpot findSpot(List<ParkingSpot> parkingSpotList);
}
