package indi.zht.unit1.model.Class;

import indi.zht.unit1.behavior.Impl.FlyWithWings;
import indi.zht.unit1.behavior.Impl.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flybehavior = new FlyWithWings();
		quackbehavior = new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a mallard duck");
	}

}
