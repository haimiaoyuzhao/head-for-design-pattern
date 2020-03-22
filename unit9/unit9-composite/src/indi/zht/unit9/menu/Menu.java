package indi.zht.unit9.menu;

import java.util.ArrayList;

public class Menu extends MenuComponent {
	private ArrayList<MenuComponent> menuComponentList;
	String name;
	String description;
	
	public Menu(String name, String description) {
		menuComponentList = new ArrayList<MenuComponent>();
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponentList.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponentList.remove(menuComponent);
	}
	
	@Override
	public void print() {
		System.out.println("menu name : "+name);
		System.out.println("description : "+description);
		for (MenuComponent componentInList : menuComponentList) {
			componentInList.print();
		}
	}
}
