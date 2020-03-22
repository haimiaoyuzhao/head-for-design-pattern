package indi.zht.unit10.state;

public class GumballMachine {
	private State soldState;
	private State soldOutState;
	private State hasQuarterState;
	private State noQuarterState;
	private State winnerState;
	private State curState;
	
	private int numberOfGumball;

	public GumballMachine(int numberOfGumball) {
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		winnerState = new WinnerState(this);
		curState = noQuarterState;
		
		this.numberOfGumball = numberOfGumball;
	}
	
	public void insertQuater() {
		curState.insertQuater();
	}
	
	public void ejectQuater() {
		curState.ejectQuater();
	}
	
	public void turnCrank() {
		curState.TurnCrank();
		curState.dispense();
	}
	
	@Override
	public String toString() {
		String s = "this is gumball machine\n";
		s += "now the number of gumball is " + String.valueOf(numberOfGumball) + "\n";
		return s;
	}
	
	void turnToSoldState() {
		curState = soldState;
	}
	
	void turnToSoldOutState() {
		curState = soldOutState;
	}
	
	void turnToNoQuarterState() {
		curState = noQuarterState;
	}
	
	void turnToHasQuarterState() {
		curState = hasQuarterState;
	}
	
	void turnToWinnerState() {
		curState = winnerState;
	}
	
	boolean isGumballEmpty() {
		return numberOfGumball == 0;
	}
	
	void releaseOneBall() {
		numberOfGumball--;
	}
}
