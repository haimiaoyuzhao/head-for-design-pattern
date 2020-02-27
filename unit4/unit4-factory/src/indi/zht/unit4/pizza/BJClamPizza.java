package indi.zht.unit4.pizza;

public class BJClamPizza extends Pizza {
	public BJClamPizza() {
		// TODO Auto-generated constructor stub
		name = "bj clam pizza";
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		dough = "bj dough";
		sauce = "bj Mar sauce";
		toppings.add("clam");
	}

}
