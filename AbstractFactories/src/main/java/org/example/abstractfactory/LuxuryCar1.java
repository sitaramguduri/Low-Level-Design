package main.java.org.example.abstractfactory;

public class LuxuryCar1 implements Car{
    public int cost(){
        System.out.println("Luxury Car 1 has been created ");
        return 10000;
    }
}
