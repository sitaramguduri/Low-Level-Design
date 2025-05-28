package main.java.org.example.factorypattern;

public class ShapeFactory {
    public Shape create(String shape){
        switch (shape){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
