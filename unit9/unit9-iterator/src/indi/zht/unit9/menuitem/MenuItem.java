package indi.zht.unit9.menuitem;

public class MenuItem {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public void printMenuItem() {
		System.out.println("name: "+name);
		System.out.println("description:"+description);
		printVegetarian();
		System.out.println("price: "+String.valueOf(price));
	}
	
	private void printVegetarian() {
		if (vegetarian) {
			System.out.println("it is vegetarian");
		}
		else {
			System.out.println("it is not vegetarian");
		}
	}
}
