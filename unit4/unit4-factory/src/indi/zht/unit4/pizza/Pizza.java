package indi.zht.unit4.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public ArrayList<String> toppings = new ArrayList<String>();
	abstract public void prepare();
	public String toString() {
		String s = "name: ";
		s += name + "\n";
		s += "dough: " + dough + "\n";
		s += "sauce: " + sauce + "\n";
		s += "toppings: ";
		for (String topping : toppings) {
			s += topping + " , ";
		}
		s += "\n";
		return s;
	}
	public void bake() {
		System.out.println("bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("cut into four diagonal slices");
	}
	public void box() {
		System.out.println("put pizza in box");
	}
}
