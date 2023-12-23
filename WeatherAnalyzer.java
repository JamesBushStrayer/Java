import java.io.*;
import java.util.*;

public class WeatherAnalyzer {
  private List<WeatherData> weatherDataList = new ArrayList<>();

  public void loadDataFromFile(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      br.readLine(); 
      System.out.println("Weather Data");
      System.out.println("------------");
      System.out.println("City\t\t\tTemperature\t\tHumidity");
      System.out.println("----\t\t\t-----------\t\t-------");
      while ((line = br.readLine()) != null) {
        String[] values = line.split(", ");
        WeatherData data = new WeatherData(values[0], Double.parseDouble(values[1]), Double.parseDouble(values[2]));
        System.out.println(data.getCity() + "\t\t" + data.getTemperature() + "\t\t\t" + data.getHumidity());
        weatherDataList.add(data);
      }
    } catch (IOException e) {
      System.err.println("Error reading from file: " + e.getMessage());
    }
  }

  public void printAverageTemperature() {
    if (weatherDataList.isEmpty()) {
      System.out.println("No data available.");
      return;
    }
    double totalTemp = 0;
    for (WeatherData data : weatherDataList) {
      totalTemp += data.getTemperature();
    }
    double average = totalTemp / weatherDataList.size();
    System.out.println("Average Temperature: " + average + "°C");
  }

  public void printHighestAndLowestTemperature() {
    if (weatherDataList.isEmpty()) {
      System.out.println("No data available.");
      return;
    }
    double highestTemp = Double.MIN_VALUE;
    double lowestTemp = Double.MAX_VALUE;
    String highestTempCity = "";
    String lowestTempCity = "";
    for (WeatherData data : weatherDataList) {
      if (data.getTemperature() > highestTemp) {
        highestTemp = data.getTemperature();
        highestTempCity = data.getCity();
      }
      if (data.getTemperature() < lowestTemp) {
        lowestTemp = data.getTemperature();
        lowestTempCity = data.getCity();
      }
    }
    System.out.println("Highest Temperature: " + highestTemp + "°C in " + highestTempCity);
    System.out.println("Lowest Temperature: " + lowestTemp + "°C in " + lowestTempCity);
  }

  public void printAverageHumidity() {
    if (weatherDataList.isEmpty()) {
      System.out.println("No data available.");
      return;
    }
    double totalHumidity = 0;
    for (WeatherData data : weatherDataList) {
      totalHumidity += data.getHumidity();
    }
    double average = totalHumidity / weatherDataList.size();
    System.out.println("Average Humidity: " + average + "%");
  }

  public void printAverageTemperatureHumidity() {
    System.out.println("-------------------------------------------------");
    if (weatherDataList.isEmpty()) {
      System.out.println("No data available.");
      return;
    }
    double totalTemp = 0;
    for (WeatherData data : weatherDataList) {
      totalTemp += data.getTemperature();
    }
    double average_temp = totalTemp / weatherDataList.size();

    double totalHumidity = 0;
    for (WeatherData data : weatherDataList) {
      totalHumidity += data.getHumidity();
    }
    double average_humidity = totalHumidity / weatherDataList.size();
    System.out.println("Averages\t\t" + average_temp + "°C (AVG)\t" + average_humidity + "% (AVG)\n");
  }

  public void printTemperatureHistogram() {
    System.out.println("\nTemperature Histogram");
    System.out.println("---------------------");
    for (WeatherData data : weatherDataList) {
      System.out.print(data.getCity() + "\t:\t");
      long temp = Math.round(data.getTemperature());
      for (int i = 0; i < temp; i++) {
        System.out.print("*");
      }
      System.out.println(" (" + temp + "°C)");
    }
  }

  // ... other methods ...
}