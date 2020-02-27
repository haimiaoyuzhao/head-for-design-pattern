package indi.zht.unit5.singleton;
/*
 * 第四版本的单件模式，
 * 双重加锁，这样可以让后来的线程不会出现同步问题
 */

public class Singleton4 {
	private volatile static Singleton4 singleton;//加volatile，防止将singleton读入cache。
	private Singleton4() {
		System.out.println("new singleton");
	}
	public static Singleton4 getInstance() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
