package StrategyDesignPattern;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SpecialStrategy());
    }
}
