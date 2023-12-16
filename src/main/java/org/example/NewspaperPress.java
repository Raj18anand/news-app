package org.example;

// Concrete Observer - Newspaper Press
class NewspaperPress implements NewsObserver {
    NewsSubject newsSubject;
    public NewspaperPress(NewsSubject newsSubject){
        this.newsSubject=newsSubject;
        newsSubject.addObserver(this);
    }
    @Override
    public void update(String news) {
        System.out.println("Newspaper Press: Today's Headline - " + news);
    }
}
