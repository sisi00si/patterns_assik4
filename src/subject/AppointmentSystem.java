package subject;

import factorypattern.Appointment;
import factorypattern.AppointmentFactory;
import observerpattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class AppointmentSystem implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers(Appointment appointment) {
        for (Observer observer : observers) {
            observer.update(appointment);
        }
    }

    public void createAppointment(String type, String description) {
        Appointment appointment = AppointmentFactory.createAppointment(type, description);
        notifyObservers(appointment);
    }
}
