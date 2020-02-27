package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.furniture.fan.Fan;

public class CeilingFanHighCommand implements Command {
	private Fan fan;
	public CeilingFanHighCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.high();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.low();
	}

}
