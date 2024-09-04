package com.Usine.observer.basic;

public interface Observeble {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
