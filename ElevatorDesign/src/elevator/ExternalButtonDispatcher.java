package elevator;

import enums.Direction;

import java.util.List;

public class ExternalButtonDispatcher {
    private List<ElevatorCarController> controllerList;

    public ExternalButtonDispatcher(List<ElevatorCarController> controllerList){
        this.controllerList = controllerList;
    }
    // we need to have different strategies here to decide which lift controller should get the request.
    public int pressButton(int currentFloor, Direction direction){
        System.out.println(" External button has been pressed at " + currentFloor );
        for(ElevatorCarController elevatorCarController: controllerList){
            int elevatorID = elevatorCarController.getLiftId();
            if(elevatorID %2 == 1 & currentFloor%2 == 1 ){
                elevatorCarController.sendExternalRequest(currentFloor, direction);
                return elevatorCarController.getLiftId();
            }else{
                elevatorCarController.sendExternalRequest(currentFloor, direction);
                return elevatorCarController.getLiftId();
            }
        }
        return 0;
    }

}
