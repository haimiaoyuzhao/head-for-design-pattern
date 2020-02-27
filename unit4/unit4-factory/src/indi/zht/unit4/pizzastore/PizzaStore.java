package indi.zht.unit4.pizzastore;

import indi.zht.unit4.pizza.Pizza;

public abstract class PizzaStore {
	public abstract Pizza createPizza(String type);
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		System.out.println(pizza.toString());
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
