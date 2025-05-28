package StrategyDesignPattern;

public class Vehicle {
    DesignStrategy designStrategy;
    public  Vehicle(DesignStrategy designStrategy){
        this.designStrategy = designStrategy;
    }
    public void drive(){
        designStrategy.drive();
    }
}
