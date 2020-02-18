package indi.zht.unit3.condiment;

import indi.zht.unit3.beverage.Beverage;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		super(beverage);
		setCost(0.1);
		setDescription("mocha");
	}
}
