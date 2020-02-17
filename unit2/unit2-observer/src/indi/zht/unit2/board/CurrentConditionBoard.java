package indi.zht.unit2.board;

import indi.zht.unit2.board.display.inter.DisplayBoard;
import indi.zht.unit2.observer.inter.Observer;
import indi.zht.unit2.subject.Subject;
import indi.zht.unit2.weatherdata.WeatherData;

public class CurrentConditionBoard implements Observer, DisplayBoard{
	private double temperature;
	private double humidity;
	private double pressure;
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	@Override
	public void update(Subject sub) {
		// TODO Auto-generated method stub
		WeatherData weatherdata = (WeatherData)sub;
		this.humidity = weatherdata.getHumidity();
		this.temperature = weatherdata.getTemperature();
		this.pressure = weatherdata.getPressure();
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("temperature is:"+String.valueOf(temperature)
				+" humidity is: "+String.valueOf(humidity)
				+" pressure is: "+String.valueOf(pressure));
	}
}
