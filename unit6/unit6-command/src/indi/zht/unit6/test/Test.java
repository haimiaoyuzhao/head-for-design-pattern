package indi.zht.unit6.test;

import indi.zht.unit6.invoker.impl.FamilyRemoteControl;
import indi.zht.unit6.invoker.inter.RemoteControl;

public class Test {
	public static void main(String[] args) {
		RemoteControl familyRemoteControl = new FamilyRemoteControl();
		familyRemoteControl.onButtonWasPushed(0);
		familyRemoteControl.undoButtonWasPushed();
		for (int i = 0; i < familyRemoteControl.getCommandNumber(); i++) {
			familyRemoteControl.onButtonWasPushed(i);
		}
		for (int i = 0; i < familyRemoteControl.getCommandNumber(); i++) {
			familyRemoteControl.offButtonWasPushed(i);
		}
		for (int i = 0; i < 3; i++) {
			familyRemoteControl.undoButtonWasPushed();
		}
	}
}
