public class WeatherData implements Subject {
	private ArrayList observers;
	private temperature;
	private humidity;
	private pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) observers.remove(i);
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observers = (Observer)observers.get(i);
			observers.update(temperature, humidity, pressure);
		}
	}
	
	public void measurentsChanged() {
		notifiyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	// What ever else
}
