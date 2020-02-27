package indi.zht.unit5.singleton;
/*
 * 第二版本的单件模式，
 * 对获得实例的整个方法进行加锁，但会影响性能。
 */

public class Singleton2 {
	private static Singleton2 singleton;
	private Singleton2() {
		System.out.println("new singleton");
	}
	public static synchronized Singleton2 getInstance() {
		if (singleton == null) {
			singleton = new Singleton2();
			return singleton;
		}
		else {
			return singleton;
		}
	}
}
