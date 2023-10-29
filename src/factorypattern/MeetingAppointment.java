package factorypattern;

class MeetingAppointment implements Appointment {
    private String type;
    private String description;

    public MeetingAppointment(String description) {
        this.type = "Meeting";
        this.description = description;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return type + " Appointment: " + description;
    }
}