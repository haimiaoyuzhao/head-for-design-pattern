package indi.zht.unit9.menu;

import java.util.Iterator;

import indi.zht.unit9.menuItemIterator.DinnerMenuIterator;
import indi.zht.unit9.menuitem.MenuItem;

public class DinnerMenu implements Menu {
	private MenuItem[] menuItems;
	private int numberOfMenuItems;
	static final int MAX_MENU_ITEMS = 8;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_MENU_ITEMS];
		numberOfMenuItems = 0;
		addItem("vegetarian BLT", "faking bacon with lettuce and tomato on whole wheat", 
				true, 2.99);
		addItem("BLT", "bacons with lettuce and tomato on whole wheat", 
				false, 2.99);
		addItem("soup of the day", "soup of the day, with a side of potato salad", 
				false, 3.29);
		addItem("hotdog", "a hot dog, with saurkraut, relish, onions, topped with cheese", 
				false, 3.05);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		DinnerMenuIterator dinnerMenuIterator = new DinnerMenuIterator(this.menuItems);
		return dinnerMenuIterator;
	}
	
	private void addItem(String name, String description, 
			boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (!isMenuItemsFull()) {
			menuItems[numberOfMenuItems++] = menuItem;
		}
	}
	
	private boolean isMenuItemsFull() {
		return numberOfMenuItems >= MAX_MENU_ITEMS;
	}

}
