package site.syso.observer.board;

import site.syso.observer.observer.Observer;
import site.syso.observer.subject.Subject;

public class StatisticsBoard implements Board, Observer {

    private Subject subject;

    public StatisticsBoard(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("This is a statistics board.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // ......
        display();
    }
}
