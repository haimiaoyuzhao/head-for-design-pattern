package indi.zht.unit2.subject;

import java.util.ArrayList;

import indi.zht.unit2.observer.inter.Observer;

public class Subject {
	private ArrayList<Observer> observers;
	public Subject() {
		observers = new ArrayList<Observer>();
	}
	public void RegisterObserver(Observer o) {
		observers.add(o);
	}
	public void RemoveObserver(Observer o) {
		observers.remove(o);
	}
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
