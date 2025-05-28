package toppings;

import pizza.BasePizza;

public class Mushroom extends TopingDecorator{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost(){
        return basePizza.cost() + 7;
    }
}
