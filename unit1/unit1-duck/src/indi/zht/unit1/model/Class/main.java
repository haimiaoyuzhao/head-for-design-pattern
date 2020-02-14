package indi.zht.unit1.model.Class;

import indi.zht.unit1.behavior.Impl.RocketFly;

public class main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.fly();
		mallard.quack();
		Duck rubberduck = new RubberDuck();
		rubberduck.fly();
		rubberduck.quack();
		rubberduck.setFlybehavior(new RocketFly());
		rubberduck.fly();
	}
}
