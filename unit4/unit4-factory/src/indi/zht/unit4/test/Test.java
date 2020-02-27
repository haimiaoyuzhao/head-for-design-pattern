package indi.zht.unit4.test;

import indi.zht.unit4.pizza.PizzaKind;
import indi.zht.unit4.pizzastore.BJPizzaStore;
import indi.zht.unit4.pizzastore.PizzaStore;
import indi.zht.unit4.pizzastore.TJPizzaStore;

public class Test {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new BJPizzaStore();
		System.out.println("i want a cheesse pizza at BJ");
		pizzaStore.orderPizza(PizzaKind.cheesePizza);
		pizzaStore = new TJPizzaStore();
		System.out.println("i want a cheesse pizza at TJ");
		pizzaStore.orderPizza(PizzaKind.clamPizza);
	}
}
