package subject;

import factorypattern.Appointment;

import observerpattern.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void notifyObservers(Appointment appointment);
}