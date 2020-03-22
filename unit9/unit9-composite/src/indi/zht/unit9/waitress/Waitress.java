package indi.zht.unit9.waitress;

import indi.zht.unit9.menu.MenuComponent;

public class Waitress {
	private MenuComponent menuComponent;
	
	public Waitress(MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}
	
	public void printMenu() {
		menuComponent.print();
	}
}
