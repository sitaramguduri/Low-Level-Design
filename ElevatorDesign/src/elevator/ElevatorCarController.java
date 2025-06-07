package elevator;

import enums.Direction;

import java.util.PriorityQueue;

public class ElevatorCarController {

    ElevatorCar car;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    public ElevatorCarController(ElevatorCar car){
        this.car = car;
    }
    public int getLiftId(){
        return car.getId();
    }
    public void moveElevatorCar( int floor){
        System.out.println(" moving the elvator: " + floor);
        if(car.getCurrentFloor() < floor){
            //has to move up for this request so add it to the minHeap;
            minHeap.add(floor);
        } else if (car.getCurrentFloor() > floor) {
            maxHeap.add(floor);
        }else{
            //on the same floor
        }
    }
    public void sendNewRequest(int floor){
        // check the direction of the elevator and its current
        // floor and assign the new request floor to either minHeap or MaxHeap
        System.out.println("Internal button has been pressed and the user wants to go to: " + floor);
        System.out.println("Lift Id: " + car.getId() + " direction : " + car.getDirection());
        if(car.getDirection() == Direction.NOTMOVING){
            //we need to check the current floor and if we want the
            // lift to move up add it to the minHeap else add it to the maxHeap
            moveElevatorCar(floor);

        }else if (car.getDirection() == Direction.UP){
            moveElevatorCar(floor);

        }else{
            moveElevatorCar(floor);

        }
        controlCar();
        // after the addition of min and
        // max heap we need to move the elevator to either up or down when the elevator is not moving
        // if it is moving we need to make sure that when its corresponding priority queue
        // is empty then we move it in opposite directon
    }
    private void controlCar() {
        // Case 1: already moving
        Direction direction = car.getDirection();
        if (direction == Direction.UP && !minHeap.isEmpty()) {
            int next = minHeap.poll();
            car.move(Direction.UP, next);
            return;
        }
        if (direction == Direction.DOWN && !maxHeap.isEmpty()) {
            int next = maxHeap.poll();
            car.move(Direction.DOWN, next);
            return;
        }

        // Case 2: we’ve become idle but there are still requests
        if (direction == Direction.NOTMOVING) {
            if (!minHeap.isEmpty()) {
                direction = Direction.UP;
                int next = minHeap.poll();
                car.move(Direction.UP, next);
                return;
            }
            if (!maxHeap.isEmpty()) {
                direction = Direction.DOWN;
                int next = maxHeap.poll();
                car.move(Direction.DOWN, next);
                return;
            }
        }

        // Case 3: no requests at all
        // direction stays NOTMOVING
    }

    public void sendExternalRequest(int requestFloor, Direction direction){
        // ask the lift to come to this floor and you want to go towards the direction
        System.out.println("requestFloor: " + requestFloor + " direction: " + direction);
        if(direction == Direction.UP){
            if(direction == car.getDirection()){
                if(car.getCurrentFloor() > requestFloor){
                    maxHeap.add(requestFloor);
                }else{
                    minHeap.add(requestFloor);
                }
            }else{
                minHeap.add(requestFloor);
            }
        }else if(direction == Direction.DOWN){
            if(direction == car.getDirection()){
                if(car.getCurrentFloor() > requestFloor){
                    maxHeap.add(requestFloor);
                }else{
                    minHeap.add(requestFloor);
                }
            }else{
                maxHeap.add(requestFloor);
            }
        }else{
            if(direction == Direction.UP){
                minHeap.add(requestFloor);
            }else{
                maxHeap.add(requestFloor);
            }
        }

        controlCar();
    }

}
