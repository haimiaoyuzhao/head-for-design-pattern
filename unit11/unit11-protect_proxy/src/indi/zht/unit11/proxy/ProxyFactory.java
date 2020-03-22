package indi.zht.unit11.proxy;

import java.lang.reflect.Proxy;

import indi.zht.unit11.bean.PersonBean;

public class ProxyFactory {
	public static PersonBean getOwnerProxy(PersonBean bean) {
		return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), 
				bean.getClass().getInterfaces(), 
				new OwnerInvocationHandler(bean));
	}
	public static PersonBean getNoOwnerProxy(PersonBean bean) {
		return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), 
				bean.getClass().getInterfaces(), 
				new NoOwnerInvocationHandler(bean));
	}
}
