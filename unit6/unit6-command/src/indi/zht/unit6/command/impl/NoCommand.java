package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("nothing to execute");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("nothing to redo");
	}

}
