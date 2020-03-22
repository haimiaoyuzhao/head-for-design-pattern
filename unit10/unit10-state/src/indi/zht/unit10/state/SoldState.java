package indi.zht.unit10.state;

public class SoldState implements State {
	private GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("please wait, we're giving you a gumball");
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("sorry, you have turned the crank");
	}

	@Override
	public void TurnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you don't have to turn the crank twice");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseOneBall();
		if (gumballMachine.isGumballEmpty()) {
			gumballMachine.turnToSoldOutState();
			System.out.println("there's no gumball in machine!");
		}
		else {
			gumballMachine.turnToNoQuarterState();
		}
	}

}
