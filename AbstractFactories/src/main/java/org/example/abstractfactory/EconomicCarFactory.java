package main.java.org.example.abstractfactory;

public class EconomicCarFactory implements AbstractFactory{
    public Car create(int price){

        if(price == 1000){
            return new EconomyCar1();
        }else if(price == 1500){
            return new EconomyCar2();
        }else if(price == 1300){
            return new EconomyCar3();
        }else{
            return null;
        }

    }
}
