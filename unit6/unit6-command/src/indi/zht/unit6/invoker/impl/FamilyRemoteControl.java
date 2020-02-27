package indi.zht.unit6.invoker.impl;

import indi.zht.unit6.command.impl.CeilingFanHighCommand;
import indi.zht.unit6.command.impl.CeilingFanOffCommand;
import indi.zht.unit6.command.impl.LightOffCommand;
import indi.zht.unit6.command.impl.LightOnCommand;
import indi.zht.unit6.command.impl.NoCommand;
import indi.zht.unit6.command.impl.PartyOffCommand;
import indi.zht.unit6.command.impl.PartyOnCommand;
import indi.zht.unit6.command.impl.StereoOffCommand;
import indi.zht.unit6.command.impl.StereoOnCommand;
import indi.zht.unit6.command.impl.TVCloseCommand;
import indi.zht.unit6.command.impl.TVOpenCommand;
import indi.zht.unit6.command.inter.Command;
import indi.zht.unit6.command.inter.MarcoCommand;
import indi.zht.unit6.furniture.fan.CeilingFan;
import indi.zht.unit6.furniture.fan.Fan;
import indi.zht.unit6.furniture.light.Light;
import indi.zht.unit6.furniture.light.LightFactory;
import indi.zht.unit6.furniture.stereo.Stereo;
import indi.zht.unit6.furniture.tv.TV;
import indi.zht.unit6.invoker.inter.RemoteControl;

public class FamilyRemoteControl extends RemoteControl {
	public FamilyRemoteControl() {
		commandNumber = 7;
		onCommands = new Command[7];
		offCommands = new Command[7];
		// TODO Auto-generated constructor stub
		Light livingRoomLight = LightFactory.createLight("livingroom");
		Light kitchenLight = LightFactory.createLight("kitchen");
		setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
		setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
		
		Fan fan = new CeilingFan();
		setCommand(2, new CeilingFanHighCommand(fan), new CeilingFanOffCommand(fan));
		
		TV tv = new TV();
		setCommand(3, new TVOpenCommand(tv), new TVCloseCommand(tv));
		
		Stereo stereo = new Stereo();
		setCommand(4, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
		
		setCommand(5, new PartyOnCommand(), new PartyOffCommand());
		
		setCommand(6, new NoCommand(), new NoCommand());
	}
}
