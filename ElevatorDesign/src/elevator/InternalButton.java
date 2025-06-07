package elevator;

import java.util.List;

public class InternalButton {

    InternalButtonDispatcher dispatcher;
    public InternalButton(List< ElevatorCarController> list){
        this.dispatcher = new InternalButtonDispatcher(list);
    }
    public void pressButton(int button, int liftId){
        this.dispatcher.sendNewRequest(button, liftId);
    }
}
