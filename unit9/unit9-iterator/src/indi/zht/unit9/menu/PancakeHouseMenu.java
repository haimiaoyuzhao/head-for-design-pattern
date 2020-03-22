package indi.zht.unit9.menu;

import java.util.ArrayList;
import java.util.Iterator;

import indi.zht.unit9.menuitem.MenuItem;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("KB's pancake breakfast", "pancakes with scrambled eggs and toast", 
				true, 2.99);
		addItem("regular pancake breakfast", "pancakes with fried eggs and sausage", 
				false, 2.99);
		addItem("blueberry pancakes", "pancakes made with fresh blueberries", 
				true, 3.49);
		addItem("Waffles", "waffles, with your choice of blueberries or strawberries",
				true, 3.59);
	}
	private void addItem(String name, String description, 
			boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	
	

}
