package elevator;

import enums.Direction;

public class ElevatorCar {
    private int id;
    private Direction direction;
    int currentFloor;
    Door door;
    InternalButton internalButton;
    Display display;

    public ElevatorCar(){
        this.direction = Direction.NOTMOVING;
        this.currentFloor = 0;
        this.door = new Door();

    }
    public Direction getDirection(){
        return direction;
    }
    public int getId(){
        return id;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void setDirection(Direction newDirection){
        direction = newDirection;
    }
    public void move(Direction newDirection, int newFloor) {
        int floorsToTravel = Math.abs(newFloor - currentFloor);
        // 1 second per floor
        long delayMs = floorsToTravel * 1_000L;

        direction = newDirection;
        System.out.println("Elevator " +  id + " is moving " + newDirection +
                " from floor " + currentFloor +
                " to floor " + newFloor +
                " (will take " + delayMs + "ms)");

        try {
            // pause the current thread to simulate travel time
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // restore interrupt flag
            System.err.println("Elevator travel interrupted");
            return;
        }

        // now we arrive
        currentFloor = newFloor;
        System.out.println("Elevator "+ id +" arrived at floor " + currentFloor);
        door.openDoor();
//        try{
//            Thread.sleep(delayMs);
//        }catch(InterruptedException e){
//            Thread.currentThread().interrupt();
//            System.err.println("Elevator is closing !!!!");
//            return;
//        }
        door.closeDoor();
    }



}
