// Declare a public class named Main.
// This class serves as the entry point for the Java program.
public class Main {
    // The main method is the entry point of the Java program.
    // The 'args' parameter can be used to pass command-line arguments to the program, but is not used in this case.
    public static void main(String[] args) {
        // Create an instance (object) of the WeatherAnalyzer class.
        // This object will be used to perform operations related to weather data.
        WeatherAnalyzer analyzer = new WeatherAnalyzer();

        // Call the loadDataFromFile method on the analyzer object.
        // This method reads weather data from a file named "weather_data.txt".
        analyzer.loadDataFromFile("weather_data.txt");

        // Call the printAverageTemperatureHumidity method on the analyzer object.
        // This method calculates and displays the average temperature and humidity from the loaded data.
        analyzer.printAverageTemperatureHumidity();

        // Call the printHighestAndLowestTemperature method on the analyzer object.
        // This method finds and displays the highest and lowest temperatures along with the associated cities.
        analyzer.printHighestAndLowestTemperature();

        // Call the printTemperatureHistogram method on the analyzer object.
        // This method displays a histogram of temperatures for each city in the loaded data.
        analyzer.printTemperatureHistogram();
    }
}