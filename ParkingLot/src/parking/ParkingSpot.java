package parking;
import java.util.Random;

public abstract class ParkingSpot {
    int id;
    int price;
    Vehicle vehicle;
    boolean isEmpty;

    public ParkingSpot(int id){
//        this.vehicle = vehicle;
        isEmpty = true;
        this.id = id;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void parkVehicle(){
        System.out.println("Vehicle is parked");
        isEmpty = false;
    }
    public void removeVehicle(){
        isEmpty = true;
    }
    public boolean isEmpty(){
        return isEmpty;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }


}
