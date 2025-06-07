package elevator;

import java.util.List;

public class InternalButtonDispatcher {
    private List<ElevatorCarController> controllerList;
    public InternalButtonDispatcher(List< ElevatorCarController> list){
        // the internal button dispatcher needs to have the controller of all the ElevatorCars
        this.controllerList = list;

    }
    public void sendNewRequest(int floor, int liftId ){
        // get the lift controller using the liftId
        ElevatorCarController requiredElevatorController = controllerList.stream().filter( ctrl -> ctrl.getLiftId() == liftId).findFirst()
                            .orElseThrow(() -> new IllegalArgumentException("No Elevator is present!!!!"));
        requiredElevatorController.sendNewRequest(floor);
    }
}
