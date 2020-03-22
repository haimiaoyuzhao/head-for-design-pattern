package indi.zht.unit11.bean;

public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRate();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRate(int rate);
}
