package Hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {


    private String specialty;

    public Doctor(String employeeNumber, String name, String specialty) {
        super(employeeNumber, name);
        this.specialty = specialty;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    public void drawBlood(Patient sickPatient) {
        sickPatient.drawBlood(5);
    }

    public int calculatePay() {
        return 120000;
    }


}
