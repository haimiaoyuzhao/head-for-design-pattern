package indi.zht.unit7.adapter;

import indi.zht.unit7.duck.Duck;
import indi.zht.unit7.turkey.Turkey;

public class TurkeyDuckAdapter implements Duck, Turkey {
	private Turkey turkey;
	private Duck duck;
	
	public TurkeyDuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	public TurkeyDuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void flySlow() {
		// TODO Auto-generated method stub
		duck.fly();
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			turkey.flySlow();
		}
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

}
