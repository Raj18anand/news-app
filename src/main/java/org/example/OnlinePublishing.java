package org.example;

// Concrete Observer - Online Publishing
class OnlinePublishing implements NewsObserver {
    NewsSubject newsSubject;
    public OnlinePublishing(NewsSubject newsSubject){
        this.newsSubject=newsSubject;
        newsSubject.addObserver(this);
    }
    @Override
    public void update(String news) {
        System.out.println("Online Publishing: Latest Update - " + news);
    }
}
