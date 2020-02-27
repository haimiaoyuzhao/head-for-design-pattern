package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.furniture.light.Light;

public class LightOffCommand implements Command {
	private Light light;
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}	

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
