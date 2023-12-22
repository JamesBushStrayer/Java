public class WeatherData {
    private String city;
    private double temperature;
    private double humidity;

    public WeatherData(String city, double temperature, double humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Getters
    public String getCity() { return city; }
    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }

    // Setters, toString, and other methods as needed...
}