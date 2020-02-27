package indi.zht.unit4.pizza;

public class BJCheesePizza extends Pizza {
	public BJCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "bj cheese pizza";
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		dough = "bj dough";
		sauce = "bj Mar sauce";
		toppings.add("fresh cheese");
	}

}
