package indi.zht.unit3.beverage;

public abstract class Beverage {
	private String description = "beverage";
	private double cost = 0;

	public Beverage() {
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	} 

}
