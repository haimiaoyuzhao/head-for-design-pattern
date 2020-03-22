package indi.zht.unit11.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import indi.zht.unit11.bean.PersonBean;

public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;
	public OwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		if ("setHotOrNotRate".equals(arg1.getName())) {
			throw new IllegalAccessException();
		}
		else if(arg1.getName().startsWith("set") || arg1.getName().startsWith("get")) {
			return arg1.invoke(personBean, arg2);
		}
		return null;
	}

}
