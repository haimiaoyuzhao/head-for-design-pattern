package indi.zht.unit11.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import indi.zht.unit11.bean.PersonBean;

public class NoOwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;
	
	public NoOwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("setHotOrNotRate".equals(method.getName())) {
			return method.invoke(personBean, args);
		}
		else if(method.getName().startsWith("get")) {
			return method.invoke(personBean, args);
		}
		else if(method.getName().startsWith("set")) {
			throw new IllegalAccessException();
		}
		return null;
	}

}
