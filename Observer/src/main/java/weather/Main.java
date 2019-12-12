package weather;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(24, 1001);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TVNews tvNews = new TVNews();
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        //weather change
        weatherForecast.changeForecast(22, 996);
        System.out.println("----------------------------------------");
        weatherForecast.changeForecast(23, 999);
    }
}