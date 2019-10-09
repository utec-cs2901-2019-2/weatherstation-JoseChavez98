package cs2901.utec.edu.pe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {

    private List<Observer> list = new ArrayList<Observer>();
    private double temperature;
    private double pressure;
    private double humidity;



    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObservers() {
        for(Observer obs : list){
            obs.update();
        }

    }

    @Override
    public void measurementsChanged() throws InterruptedException {
        Random rd = new Random();
    while(true){
        double randomValue = 1.0 + (80.0 - 1.0) * rd.nextDouble();
        Thread.sleep(4000);
        setTemperature(randomValue);
        randomValue = 1.0 + (80.0 - 1.0) * rd.nextDouble();
        setHumidity(randomValue);
        randomValue = 1.0 + (80.0 - 1.0) * rd.nextDouble();
        setPressure(randomValue);
    }
    }

    public List<Observer> getList() {
        return list;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }
}
