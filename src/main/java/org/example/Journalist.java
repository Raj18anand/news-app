package org.example;

import java.util.ArrayList;
import java.util.List;

// Subject implementation
class Journalist implements NewsSubject {
    private List observers;
    private String news;

    public Journalist(){
        observers=new ArrayList();
    }

    public void addObserver(NewsObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NewsObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (int i=0;i<observers.size();++i) {
            NewsObserver observer=(NewsObserver) observers.get(i);
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
