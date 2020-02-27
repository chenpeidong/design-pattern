package site.syso.observer;


import site.syso.observer.board.CurrentConditionBoard;
import site.syso.observer.board.ForecastBoard;
import site.syso.observer.board.StatisticsBoard;

/**
 * 观察者模式
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionBoard currentConditionBoard = new CurrentConditionBoard(weatherData);
        ForecastBoard forecastBoard = new ForecastBoard(weatherData);
        StatisticsBoard statisticsBoard = new StatisticsBoard(weatherData);

        weatherData.setMeasurement(80, 65, 30.4F);
        System.out.println();
        weatherData.setMeasurement(82, 75, 29.4F);
        System.out.println();
        weatherData.setMeasurement(78, 85, 28.4F);
    }

}
