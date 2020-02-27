package indi.zht.unit6.command.impl;

import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.command.inter.MarcoCommand;
import indi.zht.unit6.furniture.light.Light;
import indi.zht.unit6.furniture.light.LightFactory;
import indi.zht.unit6.furniture.stereo.Stereo;
import indi.zht.unit6.furniture.tv.TV;

public class PartyOffCommand extends MarcoCommand {
	public PartyOffCommand() {
		// TODO Auto-generated constructor stub
		commands = new Command[3];
		Light light = LightFactory.createLight("livingroom");
		Command lightOnCommand = new LightOffCommand(light);
		commands[0] = lightOnCommand;
		
		TV tv = new TV();
		Command tvOnCommand = new TVCloseCommand(tv);
		commands[1] = tvOnCommand;
		
		Stereo stereo = new Stereo();
		Command stereoOnCommand = new StereoOffCommand(stereo);
		commands[2] = stereoOnCommand;
	}
}
