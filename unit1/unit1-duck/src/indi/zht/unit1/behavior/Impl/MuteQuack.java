package indi.zht.unit1.behavior.Impl;

import indi.zht.unit1.behavior.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("i cannot quack");
	}

}
