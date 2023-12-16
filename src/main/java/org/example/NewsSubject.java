package org.example;

public interface NewsSubject {
    void addObserver(NewsObserver observer);
    void removeObserver(NewsObserver observer);
    void notifyObservers();
}
