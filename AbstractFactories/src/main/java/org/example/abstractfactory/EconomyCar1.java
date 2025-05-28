package main.java.org.example.abstractfactory;

public class EconomyCar1 implements Car{
    public int cost(){
        System.out.println("Economy Car 1 has been created");
        return 1000;
    }
}
