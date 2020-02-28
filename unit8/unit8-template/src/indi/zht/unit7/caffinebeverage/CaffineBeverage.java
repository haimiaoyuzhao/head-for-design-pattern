package indi.zht.unit7.caffinebeverage;

public abstract class CaffineBeverage {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (ifCustomerWantCondiments()) {
			addCondiments();
		}
		hook();
	}
	
	public void boilWater() {
		System.out.println("boiling water");
	}
	
	abstract public void brew();
	
	public void pourInCup() {
		System.out.println("pour into cup");
	}
	
	abstract public void addCondiments();
	
	public boolean ifCustomerWantCondiments() {
		return true;
	}
	
	public void hook() {
		
	}
}
