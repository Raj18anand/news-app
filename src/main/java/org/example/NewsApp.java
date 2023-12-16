package org.example;

// Usage
public class NewsApp {
    public static void main(String[] args) {
        Journalist journalist = new Journalist();

        NewsTV newsTV = new NewsTV(journalist);
        NewspaperPress newspaperPress = new NewspaperPress(journalist);
        OnlinePublishing onlinePublishing = new OnlinePublishing(journalist);

        // Journalist publishes news
        journalist.publishNews("A significant event occurred today!");

        // News TV decides to unsubscribe
        journalist.removeObserver(newsTV);

        // Journalist publishes another news
        journalist.publishNews("Breaking news: Developments in the story!");

        // The news TV is no longer notified, but other observers still receive updates
    }
}