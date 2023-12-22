public class Main {
    public static void main(String[] args) {
        WeatherAnalyzer analyzer = new WeatherAnalyzer();
        analyzer.loadDataFromFile("weather_data.txt");
        analyzer.printAverageTemperature();
        analyzer.printHighestAndLowestTemperature();
        analyzer.printAverageHumidity();
        analyzer.printTemperatureHistogram();
        // Add calls to other analysis methods as they are implemented
    }
}