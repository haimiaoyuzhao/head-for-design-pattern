package indi.zht.unit1.model.Class;

import indi.zht.unit1.behavior.Impl.FlyNoWay;
import indi.zht.unit1.behavior.Impl.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		flybehavior = new FlyNoWay();
		quackbehavior = new Squeak();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a rubber duck");
	}

}
