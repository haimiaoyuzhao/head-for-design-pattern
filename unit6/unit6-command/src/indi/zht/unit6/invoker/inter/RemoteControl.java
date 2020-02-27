package indi.zht.unit6.invoker.inter;

import java.util.Stack;

import indi.zht.unit6.command.inter.Command;

public abstract class RemoteControl{
	public Command[] onCommands;
	public Command[] offCommands;
	private Stack<Command> executedCommands;
	public int commandNumber;
	public int getCommandNumber() {
		return commandNumber;
	}
	public void setCommandNumber(int commandNumber) {
		this.commandNumber = commandNumber;
	}
	public RemoteControl() {
		// TODO Auto-generated constructor stub

		executedCommands = new Stack<Command>();
		
	}
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		executedCommands.add(onCommands[slot]);
	}
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		executedCommands.add(offCommands[slot]);
	}
	public void undoButtonWasPushed() {
		if (!executedCommands.isEmpty()) {
			Command curCommand = executedCommands.peek();
			executedCommands.pop();
			curCommand.undo();
		}
	}
}
