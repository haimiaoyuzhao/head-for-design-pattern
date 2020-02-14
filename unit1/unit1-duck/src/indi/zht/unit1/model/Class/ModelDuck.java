package indi.zht.unit1.model.Class;

import indi.zht.unit1.behavior.Impl.FlyNoWay;
import indi.zht.unit1.behavior.Impl.MuteQuack;
import indi.zht.unit1.behavior.Impl.Squeak;

public class ModelDuck extends Duck {
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flybehavior = new FlyNoWay();
		quackbehavior = new MuteQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a model duck");
	}

}
