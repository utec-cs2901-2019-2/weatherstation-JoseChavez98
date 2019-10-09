package cs2901.utec.edu.pe;

public class StatisticsDisplay implements Observer {

    public WeatherData wd ;


    public StatisticsDisplay(WeatherData wd) {
        this.wd=wd;
        wd.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }



    public void display(){
        System.out.println("from Static Display: \nTemperature: " + wd.getTemperature() + " \n " + " Humidity : " +wd.getHumidity()+ "\n Pressure: "+wd.getPressure()+ "\n" );

    }
}
