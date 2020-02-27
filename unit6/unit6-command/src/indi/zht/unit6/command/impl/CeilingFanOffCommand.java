package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.furniture.fan.CeilingFan;
import indi.zht.unit6.furniture.fan.Fan;

public class CeilingFanOffCommand implements Command {
	private int preLevel;
	private CeilingFan ceilingFan;
	public CeilingFanOffCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = (CeilingFan)fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		preLevel = ceilingFan.getLevel();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		int curLevel = ceilingFan.getLevel();
		ceilingFan.setLevel(preLevel);
		preLevel = curLevel;
	}

}
