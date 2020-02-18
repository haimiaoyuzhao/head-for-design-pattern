package indi.zht.unit3.condiment;

import indi.zht.unit3.beverage.Beverage;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		super(beverage);
		setCost(0.3);
		setDescription("whip");
	}
}
