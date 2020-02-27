package site.syso.observer.board;

import site.syso.observer.observer.Observer;
import site.syso.observer.subject.Subject;

public class ForecastBoard implements Board, Observer {

    private Subject subject;

    public ForecastBoard(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("This is a forecast board.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        //......
        display();
    }
}
