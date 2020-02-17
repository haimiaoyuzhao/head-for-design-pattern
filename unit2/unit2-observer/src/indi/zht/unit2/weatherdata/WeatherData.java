package indi.zht.unit2.weatherdata;

import indi.zht.unit2.subject.Subject;

public class WeatherData extends Subject{
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
	public void measurementsChanged() {
		notifyObserver();
	}
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
}
