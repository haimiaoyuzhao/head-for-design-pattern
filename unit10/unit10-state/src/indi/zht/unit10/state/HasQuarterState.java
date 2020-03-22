package indi.zht.unit10.state;

import java.util.Random;

public class HasQuarterState implements State {
	private Random randomWinner = new Random(System.currentTimeMillis());
	private GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("you have inserted a quarter, cann't insert another one");
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("quarter returned");
		gumballMachine.turnToNoQuarterState();
	}

	@Override
	public void TurnCrank() {
		// TODO Auto-generated method stub
		System.out.println("waiting¡­¡­");
		if (willTurnToWinnerState()) {
			gumballMachine.turnToWinnerState();
		}
		else {
			gumballMachine.turnToSoldState();
		}
	}

	private boolean willTurnToWinnerState() {
		int winner = randomWinner.nextInt(10);
		if (winner == 0 && !gumballMachine.isGumballEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

}
