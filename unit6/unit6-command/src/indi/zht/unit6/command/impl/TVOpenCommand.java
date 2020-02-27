package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.furniture.tv.TV;

public class TVOpenCommand implements Command {
	private TV tv;
	public TVOpenCommand(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}

}
