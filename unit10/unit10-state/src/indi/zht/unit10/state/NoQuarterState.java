package indi.zht.unit10.state;

public class NoQuarterState implements State {
	private GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("you have inserted a quarter");
		gumballMachine.turnToHasQuarterState();
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("sorry, you don't have quarters");

	}

	@Override
	public void TurnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned, but you don't have a quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}
}
