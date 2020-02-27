package indi.zht.unit4.pizza;

public class TJClamPizza extends Pizza {
	public TJClamPizza() {
		// TODO Auto-generated constructor stub
		name = "tj clam pizza";
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		dough = "tj white dough";
		sauce = "tj tomato sauce";
		toppings.add("tj clam");
	}
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut into five square slices");
	}
}
