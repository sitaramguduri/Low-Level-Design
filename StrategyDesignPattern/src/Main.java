import StrategyDesignPattern.OffRoadVehicle;
import StrategyDesignPattern.PublicVehicle;
import StrategyDesignPattern.SportsVehicle;
import StrategyDesignPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle publicVehicle = new PublicVehicle();
        publicVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}