package observerpattern;

import factorypattern.Appointment;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Appointment appointment) {
        System.out.println(name + ", new appointment: " + appointment);
    }
}