package indi.zht.unit4.pizzastore;

import indi.zht.unit4.pizza.BJCheesePizza;
import indi.zht.unit4.pizza.BJClamPizza;
import indi.zht.unit4.pizza.Pizza;
import indi.zht.unit4.pizza.PizzaKind;

public class BJPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (PizzaKind.cheesePizza.equals(type)) {
			return new BJCheesePizza();
		}
		else if(PizzaKind.clamPizza.equals(type)) {
			return new BJClamPizza();
		}
		return null;
	}

}
