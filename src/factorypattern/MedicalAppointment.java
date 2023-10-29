package factorypattern;

class MedicalAppointment implements Appointment {
    private String type;
    private String description;

    public MedicalAppointment(String description) {
        this.type = "Medical";
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

