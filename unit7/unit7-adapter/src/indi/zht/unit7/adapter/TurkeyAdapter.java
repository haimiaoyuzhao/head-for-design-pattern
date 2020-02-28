package indi.zht.unit7.adapter;

import indi.zht.unit7.duck.Duck;
import indi.zht.unit7.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
			turkey.flySlow();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

}
