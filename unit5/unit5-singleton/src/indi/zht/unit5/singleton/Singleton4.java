package indi.zht.unit5.singleton;
/*
 * ���İ汾�ĵ���ģʽ��
 * ˫�ؼ��������������ú������̲߳������ͬ������
 */

public class Singleton4 {
	private volatile static Singleton4 singleton;//��volatile����ֹ��singleton����cache��
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
