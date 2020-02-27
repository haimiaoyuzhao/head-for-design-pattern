package indi.zht.unit5.singleton;
/*
 * �����汾�ĵ���ģʽ��
 * ��ȡ���еط�ʽ����ǰ��new�ã������Ͳ�����ֻ������⡣
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
