package indi.zht.unit7.test;

import indi.zht.unit7.adapter.TurkeyAdapter;
import indi.zht.unit7.adapter.TurkeyDuckAdapter;
import indi.zht.unit7.duck.Duck;
import indi.zht.unit7.duck.MallardDuck;
import indi.zht.unit7.turkey.Turkey;
import indi.zht.unit7.turkey.WildTurkey;

public class Test {
	public static void main(String[] args) {
		//²âÊÔÊÊÅäÆ÷
		Turkey turkey = new WildTurkey();
		Duck fakeDuck = new TurkeyAdapter(turkey);
		System.out.println("i am a turkey");
		fakeDuck.fly();
		fakeDuck.quack();
		
		Duck duck = new MallardDuck();
		System.out.println("i am a duck");
		duck.fly();
		duck.quack();
		
		//²âÊÔË«ÏòÊÊÅäÆ÷
		
		Duck duck2 = new MallardDuck();
		Turkey fakeTurkey2 = new TurkeyDuckAdapter(duck2);
		System.out.println("i am duck2");
		fakeTurkey2.flySlow();
		fakeTurkey2.gobble();
		
		Turkey turkey2 = new WildTurkey();
		Duck fakeDuck2 = new TurkeyDuckAdapter(turkey2);
		System.out.println("i am turkey2");
		fakeDuck2.fly();
		fakeDuck2.quack();
	}
}
