package observerpattern;


import factorypattern.Appointment;

public interface Observer {
    void update(Appointment appointment);
}