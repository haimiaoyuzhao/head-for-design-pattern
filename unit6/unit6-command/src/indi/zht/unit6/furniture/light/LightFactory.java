package indi.zht.unit6.furniture.light;

public class LightFactory {
	public static Light createLight(String type) {
		if ("livingroom".equals(type)) {
			return new LivingRoomLight();
		}
		else if("kitchen".equals(type)) {
			return new KitchenLight();
		}
		else {
			return null;
		}
	}
}
