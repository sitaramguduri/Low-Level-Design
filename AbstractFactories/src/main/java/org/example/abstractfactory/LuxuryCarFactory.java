package main.java.org.example.abstractfactory;

public class LuxuryCarFactory implements AbstractFactory{
    public Car create(int price){
        if(price == 10000){
            return new LuxuryCar1();
        } else if (price == 20000) {
            return new LuxuryCar2();
        }else{
            return null;
        }
    }
}
