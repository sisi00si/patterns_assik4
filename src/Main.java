import observerpattern.User;
import subject.AppointmentSystem;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Dr. Baigaliyeva");
        User user2 = new User("Dr. Seitov");

        AppointmentSystem appointmentSystem = new AppointmentSystem();

        appointmentSystem.addObserver(user1);
        appointmentSystem.addObserver(user2);

        appointmentSystem.createAppointment("Medical", "Checkup with patient, Aizhan");
        appointmentSystem.createAppointment("Meeting", "Discussion at 2 PM");
    }
}
