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

        Thread.sleep(4000);
        setTemperature(rd.nextDouble());
        setHumidity(rd.nextDouble());
        setPressure(rd.nextDouble());
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
