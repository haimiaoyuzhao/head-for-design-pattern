package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.furniture.stereo.Stereo;

public class StereoOffCommand implements Command{
	private Stereo stereo;
	public StereoOffCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
	}
	

}
