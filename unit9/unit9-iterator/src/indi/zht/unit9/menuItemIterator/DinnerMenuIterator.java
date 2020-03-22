package indi.zht.unit9.menuItemIterator;
import java.util.Iterator;

import indi.zht.unit9.menuitem.MenuItem;

public class DinnerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] menuItems;
	private int pointer = 0;
	
	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pointer < menuItems.length && menuItems[pointer] != null;
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		return menuItems[pointer++];
	}

}
