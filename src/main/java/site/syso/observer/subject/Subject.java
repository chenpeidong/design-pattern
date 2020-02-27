package site.syso.observer.subject;

import site.syso.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
