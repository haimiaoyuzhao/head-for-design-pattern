package indi.zht.unit9.waitress;

import java.util.ArrayList;
import java.util.Iterator;

import indi.zht.unit9.menu.Menu;
import indi.zht.unit9.menuitem.MenuItem;

public class Waitress {
	ArrayList<Menu> menus;
	
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		for (Menu menu : menus) {
			printMenu(menu);
		}
	}
	
	private void printMenu(Menu menu) {
		System.out.println(menu.getClass());
		printMenuContents(menu);
		System.out.println("");
		
	}
	
	private void printMenuContents(Menu menu) {
		Iterator<MenuItem> menuIterator = menu.createIterator();
		while(menuIterator.hasNext()) {
			MenuItem menuItem = menuIterator.next();
			menuItem.printMenuItem();
		}
	}
}
