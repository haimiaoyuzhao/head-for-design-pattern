package indi.zht.unit9.test;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import indi.zht.unit9.menu.CafeMenu;
import indi.zht.unit9.menu.DinnerMenu;
import indi.zht.unit9.menu.Menu;
import indi.zht.unit9.menu.PancakeHouseMenu;
import indi.zht.unit9.waitress.Waitress;

public class Test {
	public static void main(String[] args) {
		Waitress waitress = getWaitress();
		waitress.printMenu();
		
		
	}
	
	private static Waitress getWaitress() {
		CafeMenu cafeMenu = new CafeMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(cafeMenu);
		menus.add(dinnerMenu);
		menus.add(pancakeHouseMenu);
		Waitress waitress = new Waitress(menus);
		return waitress;
	}
}
