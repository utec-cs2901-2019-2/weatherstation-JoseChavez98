package cs2901.utec.edu.pe;



public class Main {

    public static void main(String[] args) {

    WeatherData wd = new WeatherData();
    new ForecastDisplay(wd);
    new CurrentCoditions(wd);
    new StatisticsDisplay(wd);

        try {
            wd.measurementsChanged();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
