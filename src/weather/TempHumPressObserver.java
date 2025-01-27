package weather;

/*
 * This is an interface for a weather station observer that 
 * reads temperature, humidity, and pressure data.
 * Note: this is a more specific name than the one used in 
 * the textbook code (Observer)
 */

@FunctionalInterface
// TempHumPressObserver is a functional interface since it has 
// only one method to implement
public interface TempHumPressObserver {
	public void update(float temp, float humidity, float pressure);
}
