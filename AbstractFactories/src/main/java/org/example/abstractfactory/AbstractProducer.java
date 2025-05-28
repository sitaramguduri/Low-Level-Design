package main.java.org.example.abstractfactory;

public class AbstractProducer {
    public AbstractFactory createFactory(String value){
        if(value.equals("Luxury")){
            return new LuxuryCarFactory();
        }else if(value.equals("Economy")){
            return new EconomicCarFactory();
        }else{
            return null;
        }
    }
}
