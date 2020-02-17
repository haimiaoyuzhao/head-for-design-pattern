package indi.zht.unit2.test;

import indi.zht.unit2.board.CurrentConditionBoard;
import indi.zht.unit2.weatherdata.WeatherData;

public class Test {
	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		CurrentConditionBoard cboard = new CurrentConditionBoard();
		weather.RegisterObserver(cboard);
		weather.setMeasurements(10, 10, 10);
	}
}
