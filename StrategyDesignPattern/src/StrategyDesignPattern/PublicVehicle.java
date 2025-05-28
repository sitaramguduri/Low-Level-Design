package StrategyDesignPattern;

public class PublicVehicle extends Vehicle{

    public PublicVehicle(){
        super(new NormalStrategy());
    }
}
