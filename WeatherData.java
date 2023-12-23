// Declare a public class named WeatherData.
public class WeatherData {
    // Declare private fields to store city name, temperature, and humidity.
    // These are properties of the weather data.
    private String city;
    private double temperature;
    private double humidity;

    // Constructor for WeatherData class.
    // It initializes the WeatherData object with city name, temperature, and humidity values.
    public WeatherData(String city, double temperature, double humidity) {
        // Assign the values passed to the constructor to the class fields.
        this.city = city;             // Sets the city name.
        this.temperature = temperature; // Sets the temperature.
        this.humidity = humidity;       // Sets the humidity.
    }

    // Public method to get the city name.
    // It returns the city name stored in the WeatherData object.
    public String getCity() { return city; }

    // Public method to get the temperature.
    // It returns the temperature value stored in the WeatherData object.
    public double getTemperature() { return temperature; }

    // Public method to get the humidity.
    // It returns the humidity value stored in the WeatherData object.
    public double getHumidity() { return humidity; }
}