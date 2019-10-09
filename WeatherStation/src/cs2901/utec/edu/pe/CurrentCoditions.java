package cs2901.utec.edu.pe;


public class CurrentCoditions implements Observer {
    public WeatherData wd ;


    public CurrentCoditions(WeatherData wd) {
        this.wd=wd;
        wd.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }



    public void display(){
        System.out.println("from Current Conditions: \nTemperature: " + wd.getTemperature() + " \n " + " Humidity : " +wd.getHumidity()+ "\n Pressure: "+wd.getPressure()+ "\n" );

    }
}
