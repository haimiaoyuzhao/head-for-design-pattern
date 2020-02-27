package indi.zht.unit5.singleton;
/*
 * �ڶ��汾�ĵ���ģʽ��
 * �Ի��ʵ���������������м���������Ӱ�����ܡ�
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
