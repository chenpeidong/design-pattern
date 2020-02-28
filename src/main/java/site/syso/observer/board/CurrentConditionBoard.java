package site.syso.observer.board;

import site.syso.observer.observer.Observer;
import site.syso.observer.subject.Subject;

public class CurrentConditionBoard implements Board, Observer {

    private Subject subject;

    private float temperature;

    private float humidity;

    public CurrentConditionBoard(Subject weatherData) {
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
