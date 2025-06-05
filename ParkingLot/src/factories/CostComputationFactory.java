package factories;

import Types.VehicleType;
import parking.Vehicle;
import parkingstrategies.CostComputationStrategy;
import parkingstrategies.FourWheelComputationStrategy;
import parkingstrategies.TwoWheelComputationStrategy;

public class CostComputationFactory {
    public CostComputationStrategy createFactory(Vehicle vehicle){
        if (vehicle.getVehicleType() == VehicleType.TWO){
            System.out.println("get cost for the parking: ");
            return new TwoWheelComputationStrategy();
        }else if(vehicle.getVehicleType() == VehicleType.FOUR){
            return new FourWheelComputationStrategy();
        }else{
            return null;
        }

    }
}
