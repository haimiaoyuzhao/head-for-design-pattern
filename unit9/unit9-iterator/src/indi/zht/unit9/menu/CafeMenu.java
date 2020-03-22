package indi.zht.unit9.menu;

import java.util.HashMap;
import java.util.Iterator;

import indi.zht.unit9.menuitem.MenuItem;

public class CafeMenu implements Menu {
	private HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
	
	public CafeMenu() {
		addItem("veggie burger and air fries", 
				"veggie burger on a whole wheat bun, tomato, and fries",
				true, 3.99);
		addItem("soup of the day",
				"a cup of the soup of the day, with a side salad", 
				false, 3.60);
		addItem("Burrito", 
				"a large burrito, with whole pinto beans, salsa, guacamole",
				true, 4.29);
		
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
	
	private void addItem(String name, String description, 
			boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(name, menuItem);
	}
}
