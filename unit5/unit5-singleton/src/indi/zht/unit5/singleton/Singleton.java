package indi.zht.unit5.singleton;
/*
 * 第一版本的单件模式，
 * 多线程是有问题的。
 */

public class Singleton {
	private static Singleton singleton;
	private Singleton() {
		System.out.println("new singleton");
	}
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		}
		else {
			return singleton;
		}
	}
}
