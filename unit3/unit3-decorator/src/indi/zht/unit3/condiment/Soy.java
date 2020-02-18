package indi.zht.unit3.condiment;

import indi.zht.unit3.beverage.Beverage;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		super(beverage);
		setCost(0.2);
		setDescription("soy");
	}
}
