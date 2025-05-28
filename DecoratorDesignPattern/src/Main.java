import pizza.BasePizza;
import pizza.VegetablePizza;
import toppings.ExtraCheese;
import toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 =new Mushroom(new ExtraCheese(new VegetablePizza()));
        System.out.println("pizza1 cost "+ pizza1.cost());
        BasePizza pizza2 = new Mushroom(new VegetablePizza());
        System.out.println("pizza2 cost " + pizza2.cost());

    }
}