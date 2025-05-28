package toppings;

import pizza.BasePizza;

public class ExtraCheese extends TopingDecorator{

    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;

    }
    public int cost(){
        return basePizza.cost() + 5;
    }
}
