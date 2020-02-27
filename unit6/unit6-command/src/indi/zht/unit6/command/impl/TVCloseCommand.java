package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.furniture.tv.TV;

public class TVCloseCommand implements Command {
	private TV tv;
	public TVCloseCommand(TV tv) {
		this.tv = tv;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.on();
	}

}
