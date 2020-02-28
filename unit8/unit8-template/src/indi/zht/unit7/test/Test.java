package indi.zht.unit7.test;

import indi.zht.unit7.caffinebeverage.Coffee;
import indi.zht.unit7.caffinebeverage.Tea;

public class Test {
	public static void main(String[] args) {
		System.out.println("i want a cup of coffee");
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		
		System.out.println("i want a cup of tea");
		Tea tea = new Tea();
		tea.prepareRecipe();
	}
}
