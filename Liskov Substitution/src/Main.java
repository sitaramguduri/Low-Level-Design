import BadDesignVehicles.Bicycle;
import BadDesignVehicles.Car;
import BadDesignVehicles.MotorCycle;
import BadDesignVehicles.Vehicles;
import GoodDesignVehicles.NewBicycle;
import GoodDesignVehicles.NewCar;
import GoodDesignVehicles.NewMotorcycle;
import GoodDesignVehicles.NewVehicles;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        BadDesign();
        GoodDesign();
    }
    public static void GoodDesign(){
        List<NewVehicles> vehicleList = new ArrayList<>();
        vehicleList.add(new NewCar());
        vehicleList.add(new NewMotorcycle());
        vehicleList.add(new NewBicycle());
        for(NewVehicles vehicles: vehicleList){
            System.out.println(vehicles.getNumberOfWheels());
        }

    }
    public static void BadDesign(){
        List<Vehicles> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Bicycle());
        //the null in bicycle hasEngine causes null pointer issue in the below loop.
        //Bad Design//
        for(Vehicles vehicle: vehicleList){
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}