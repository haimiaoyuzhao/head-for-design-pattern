package indi.zht.unit3;

import indi.zht.unit3.beverage.Beverage;
import indi.zht.unit3.beverage.DarkCoffee;
import indi.zht.unit3.condiment.Mocha;
import indi.zht.unit3.condiment.Soy;

public class test {
	public static void main(String[] args) {
		Beverage darkcoffee = new DarkCoffee();
		Beverage darkcoffee_with_mocha = new Mocha(darkcoffee);
		Beverage darkcoffee_with_mocha_soy = new Soy(darkcoffee_with_mocha);
		System.out.println("cost is" + String.valueOf(darkcoffee_with_mocha_soy.getCost()));
		System.out.println("description is " + darkcoffee_with_mocha_soy.getDescription());
	}
}
