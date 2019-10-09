package cs2901.utec.edu.pe;

public class ForecastDisplay implements Observer{
    public WeatherData wd ;


    public ForecastDisplay(WeatherData wd) {
        this.wd=wd;
        wd.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }



    public void display(){
        System.out.println("from Forecast Display: \nTemperature: " + wd.getTemperature() + " \n " + " Humidity : " +wd.getHumidity()+ "\n Pressure: "+wd.getPressure()+ "\n" );

    }
}
