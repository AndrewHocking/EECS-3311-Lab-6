package test;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Obp implements PropertyChangeListener {

    private int news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((int) evt.getNewValue());
    }

    public int getNews() {
        return news;
    }

    public void setNews(int news) {
        this.news = news;
    }
}