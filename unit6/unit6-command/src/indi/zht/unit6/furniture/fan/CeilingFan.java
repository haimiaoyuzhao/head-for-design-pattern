package indi.zht.unit6.furniture.fan;

public class CeilingFan implements Fan {
	int level;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
		System.out.println("ceiling fan's level is "+String.valueOf(level));
	}
	public CeilingFan() {
		// TODO Auto-generated constructor stub
		level = 0;
	}
	@Override
	public void high() {
		// TODO Auto-generated method stub
		level += 1;
		System.out.println("ceiling fan is higher, now the level is "+String.valueOf(level));
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		level = 0;
		System.out.println("ceiling fan is closed");
	}
	@Override
	public void low() {
		// TODO Auto-generated method stub
		if (level > 0) {
			level -= 1;
			System.out.println("ceiling fan is higher, now the level is "+String.valueOf(level));
		}
		else {
			System.out.println("ceiling fan is closed, cannot be lower");
		}
		
	}

}
