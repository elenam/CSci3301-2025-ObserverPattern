package weather;

public class WeatherStation {
	/*
	 * Main performs the simulation. 
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		// Q1: uncomment the two lines of code below and fill in the blanks.
		// Your goal is to create a needUmbrella observer that checks the humidity
		// and if it is >= 90 then prints "Bring an umbrella!", otherwise 
		// it doesn't do anything. 
		
		// Note that you don't need to specify the types of parameters 
		// for the update method (Java can infer those), but you need the names.

		// Fill in the blanks here: 
		//Observer needUmbrella = (......)-> {if ..... System.out.println("Bring an umbrella!");};
		//weatherData.registerObserver(needUmbrella);
		
		// Q2: 
		// Create and register another observer that detects some other 
		// condition (say, temperatures below freezing) and provides
		// some advice to the user (like wearing a hat). 
		// You may need to add more setMeasurements calls below to test. 

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f);
	}
}