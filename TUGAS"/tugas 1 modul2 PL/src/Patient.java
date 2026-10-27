
class Patient {
    private String name;
    private int recordNumber;
    private Doctor doctor;
    private String disease;

    public Patient(String name, int recordNumber,
                   Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Record Number: " + recordNumber);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor in Charge: " + doctor.getName());
    }

    public void updateDisease(String newDisease) {
        disease = newDisease;
        System.out.println("Disease updated to: " + disease);
    }
}
