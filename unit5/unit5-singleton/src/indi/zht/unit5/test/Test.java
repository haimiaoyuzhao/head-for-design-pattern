package indi.zht.unit5.test;

import java.util.ArrayList;

import indi.zht.unit5.singleton.Singleton;
import indi.zht.unit5.singleton.Singleton2;
import indi.zht.unit5.singleton.Singleton3;
import indi.zht.unit5.singleton.Singleton4;

public class Test implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton4 s = Singleton4.getInstance();
		System.out.println("run");
	}
	public static void main(String[] args) {
		ArrayList<Runnable> tests= new ArrayList<Runnable>();
		for (int i = 0; i < 10; i++) {
			tests.add(new Test());
		}
		for (Runnable test : tests) {
			new Thread(test).start();
		}
		
	}

}
