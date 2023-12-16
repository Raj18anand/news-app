package org.example;

// Concrete Observer - News TV
class NewsTV implements NewsObserver {
    NewsSubject newsSubject;
    public NewsTV(NewsSubject newsSubject){
        this.newsSubject=newsSubject;
        newsSubject.addObserver(this);
    }
    @Override
    public void update(String news) {
        System.out.println("News TV: Breaking News - " + news);
    }
}
