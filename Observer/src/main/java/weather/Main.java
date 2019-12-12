package weather;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather(24, 1001);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TVNews tvNews = new TVNews();
        weather.registerObserver(internetNews);
        weather.registerObserver(radioNews);
        weather.registerObserver(tvNews);
        //weather change
        weather.changeForecast(22, 996);
        weather.changeForecast(23, 999);
    }
}