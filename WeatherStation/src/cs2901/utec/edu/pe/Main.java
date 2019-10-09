package cs2901.utec.edu.pe;



public class Main {

    public static void main(String[] args) {

    WeatherData wd = new WeatherData();
    new ForecastDisplay(wd);
    new CurrentCoditions(wd);
    new StatisticsDisplay(wd);

    wd.setHumidity(12.9);
    wd.setPressure(13.6);
    wd.setTemperature(13.45);

    }
}
