package factorypattern;

public class AppointmentFactory {
    public static Appointment createAppointment(String type, String description) {
        if ("Medical".equalsIgnoreCase(type)) {
            return new MedicalAppointment(description);
        } else if ("Meeting".equalsIgnoreCase(type)) {
            return new MeetingAppointment(description);
        }
        return null;
    }
}





