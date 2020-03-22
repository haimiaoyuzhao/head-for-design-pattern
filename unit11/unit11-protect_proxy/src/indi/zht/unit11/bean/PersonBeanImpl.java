package indi.zht.unit11.bean;

public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	private int rating = 0;
	private int ratingCount = 0;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interests;
	}

	@Override
	public int getHotOrNotRate() {
		// TODO Auto-generated method stub
		return rating;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRate(int rate) {
		this.rating += rate;
		this.ratingCount++;
	}

}
