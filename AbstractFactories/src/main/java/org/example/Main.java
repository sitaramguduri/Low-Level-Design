package main.java.org.example;

import main.java.org.example.abstractfactory.AbstractFactory;
import main.java.org.example.abstractfactory.AbstractProducer;
import main.java.org.example.abstractfactory.Car;
import main.java.org.example.factorypattern.Shape;
import main.java.org.example.factorypattern.ShapeFactory;

public class Main {

    public static void FactoryPattern(){
        Shape circle = new ShapeFactory().create("CIRCLE");
        circle.draw();
        Shape square = new ShapeFactory().create("SQUARE");
        square.draw();
    }
    public static void main(String[] args) {

//        FactoryPattern();
        AbstractFactory abstractFactory= new AbstractProducer().createFactory("Economy");
        Car economyCar1 = abstractFactory.create(1000);
        System.out.println("Economy Car 1 has the correct price :" + economyCar1.cost());

        AbstractFactory luxuryAbstractFactory = new AbstractProducer().createFactory("Luxury");
        Car luxuryCar1 = luxuryAbstractFactory.create(10000);
        System.out.println("Abstract Car 2 has the price : "+ luxuryCar1.cost());



    }
}