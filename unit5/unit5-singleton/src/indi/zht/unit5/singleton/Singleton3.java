package indi.zht.unit5.singleton;
/*
 * 第三版本的单件模式，
 * 采取急切地方式，提前就new好，这样就不会出现互斥问题。
 */

public class Singleton3 {
	private static Singleton3 singleton = new Singleton3();
	private Singleton3() {
		System.out.println("new singleton");
	}
	public static synchronized Singleton3 getInstance() {
		return singleton;
	}
}
