
package indi.zht.unit10.state;

public class WinnerState implements State {
	private GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("insert failed, waiting, the ball in coming");
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("you have turned, and you cannot eject");
	}

	@Override
	public void TurnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you cannot turn the crank twice");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		releaseTheFirstOne();
		releaseTheSecondOne();
		System.out.println("congratulations, you're a winner");
	}
	
	private void releaseTheFirstOne() {
		gumballMachine.releaseOneBall();
		if (gumballMachine.isGumballEmpty()) {
			gumballMachine.turnToSoldOutState();
			System.out.println("there's no gumball in machine!");
		}
	}
	
	private void releaseTheSecondOne() {
		if (!gumballMachine.isGumballEmpty()) {
			gumballMachine.releaseOneBall();
			if (gumballMachine.isGumballEmpty()) {
				System.out.println("there's no gumball in machine!");
				gumballMachine.turnToSoldOutState();
			}
			else {
				gumballMachine.turnToNoQuarterState();
			}
		}
	}

}
