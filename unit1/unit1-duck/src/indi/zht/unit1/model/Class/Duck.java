package indi.zht.unit1.model.Class;

import indi.zht.unit1.behavior.Interface.FlyBehavior;
import indi.zht.unit1.behavior.Interface.QuackBehavior;

public abstract class Duck {
	public FlyBehavior flybehavior;
	public QuackBehavior quackbehavior;	
	abstract public void display();
	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}
	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}
	public QuackBehavior getQuackbehavior() {
		return quackbehavior;
	}
	public void setQuackbehavior(QuackBehavior quackbehavior) {
		this.quackbehavior = quackbehavior;
	}
	public void fly() {
		flybehavior.fly();
	}
	public void quack() {
		quackbehavior.quack();
	}
}
