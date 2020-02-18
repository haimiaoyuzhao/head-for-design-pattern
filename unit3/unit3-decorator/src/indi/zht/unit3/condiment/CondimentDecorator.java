package indi.zht.unit3.condiment;

import indi.zht.unit3.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage fat_beverage;
	private String description = "condiment";
	private double cost = 0;
	
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public CondimentDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		fat_beverage = beverage;
	}
	@Override
	public String getDescription() {
		return fat_beverage.getDescription() + "," + description;
	}
	@Override
	public double getCost() {
		return fat_beverage.getCost() + cost;
	}
}
