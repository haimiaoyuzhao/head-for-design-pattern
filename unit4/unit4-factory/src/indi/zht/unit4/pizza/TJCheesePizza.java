package indi.zht.unit4.pizza;

public class TJCheesePizza extends Pizza {
	public TJCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "tj cheese pizza";
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		dough = "tj white dough";
		sauce = "tj tomato sauce";
		toppings.add("tj cheese");
	}
	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut into five square slices");
	}
}
