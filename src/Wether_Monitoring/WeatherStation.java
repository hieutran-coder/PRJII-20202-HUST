package Wether_Monitoring;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);
		
		// StatisticsDisplay statisticsDisplay = new StaticsticsDisplay(weatherData);
		// ForeCastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 50, 30.4f);
	}
}
