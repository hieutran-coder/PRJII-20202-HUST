package Wether_Monitoring;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
