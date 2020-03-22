package indi.zht.unit9.test;


import indi.zht.unit9.menu.Menu;
import indi.zht.unit9.menu.MenuComponent;
import indi.zht.unit9.menu.MenuItem;
import indi.zht.unit9.waitress.Waitress;

public class Test {
	public static void main(String[] args) {
		Waitress waitress = getWaitress();
		waitress.printMenu();
	}
	
	private static Waitress getWaitress() {
		MenuComponent menu = getMenu();
		Waitress waitress = new Waitress(menu);
		return waitress;
	}
	
	private static MenuComponent getMenu() {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "all menus");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);
		
		dinnerMenu.add(new MenuItem("Pasta", 
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true, 3.89));
		dinnerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("apple pie",
						"apple pie with a flakey crust, topped with vanilla ice cream",
						true, 1.59));
		
		return allMenus;	
	}
}
