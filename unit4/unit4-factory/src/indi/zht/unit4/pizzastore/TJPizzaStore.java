package indi.zht.unit4.pizzastore;

import indi.zht.unit4.pizza.Pizza;
import indi.zht.unit4.pizza.PizzaKind;
import indi.zht.unit4.pizza.TJCheesePizza;
import indi.zht.unit4.pizza.TJClamPizza;

public class TJPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (PizzaKind.cheesePizza.equals(type)) {
			return new TJCheesePizza();
		}
		else if(PizzaKind.clamPizza.equals(type)) {
			return new TJClamPizza();
		}
		return null;
	}

}
