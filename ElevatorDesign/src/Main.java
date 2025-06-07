import elevator.ElevatorCar;
import elevator.ElevatorCarController;
import elevator.ExternalButtonDispatcher;
import elevator.InternalButtonDispatcher;
import enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        ElevatorCar car1 = new ElevatorCar();
        ElevatorCar car2 = new ElevatorCar();
        // we need to have the controller for the cars

        ElevatorCarController carController1 = new ElevatorCarController(car1);
        ElevatorCarController carController2 = new ElevatorCarController(car2);

        // we now need to have a external dispatcher
        List<ElevatorCarController> carControllerList = new ArrayList<>();
        carControllerList.add(carController1);
        carControllerList.add(carController2);
        ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher(carControllerList);

        // someone from floor 1 wants to go to the top floor

        int liftId1 = externalButtonDispatcher.pressButton(1 , Direction.UP);

        InternalButtonDispatcher internalDispatcher =
                new InternalButtonDispatcher(carControllerList);

        int destination   = 5;
        internalDispatcher.sendNewRequest(destination, liftId1);

        // floor 3 wants to go up to top floor
        externalButtonDispatcher.pressButton(3, Direction.UP);


    }
}