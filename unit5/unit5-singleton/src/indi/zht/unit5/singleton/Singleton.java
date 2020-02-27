package indi.zht.unit5.singleton;
/*
 * ��һ�汾�ĵ���ģʽ��
 * ���߳���������ġ�
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
