package indi.zht.unit10.test;

import indi.zht.unit10.state.GumballMachine;

public class Test {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
