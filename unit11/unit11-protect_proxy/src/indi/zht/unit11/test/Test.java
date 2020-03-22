package indi.zht.unit11.test;

import indi.zht.unit11.bean.PersonBean;
import indi.zht.unit11.bean.PersonBeanImpl;
import indi.zht.unit11.proxy.ProxyFactory;

public class Test {
	public static void main(String[] args) {
		PersonBean personA = new PersonBeanImpl();
		PersonBean personAOwner = ProxyFactory.getOwnerProxy(personA);
		personAOwner.setInterests("abc");
		try {
			
			personAOwner.setHotOrNotRate(1);
		} catch (Exception e) {
			System.out.println("you cannot set rate by yourself");
		}
		
		PersonBean personB = new PersonBeanImpl();
		PersonBean personBNoOwner = ProxyFactory.getNoOwnerProxy(personB);
		
		try {
			personBNoOwner.setInterests("abc");
			
		} catch (Exception e) {
			System.out.println("you cannot change others");
		}
		personBNoOwner.setHotOrNotRate(1);
		
	}
}
