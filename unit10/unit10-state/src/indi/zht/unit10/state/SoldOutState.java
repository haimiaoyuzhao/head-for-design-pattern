package indi.zht.unit10.state;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("sorry, you cannot insert a quarter, machine is empty");
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted");
	}

	@Override
	public void TurnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned, but you haven't inserted a quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
	}

}
