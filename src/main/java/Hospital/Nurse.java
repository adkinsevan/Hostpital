package Hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties {

    private int numOfPatients;

    public Nurse(String employeeNumber, String name, int numOfPatients){
        super(employeeNumber, name);
        this.numOfPatients = numOfPatients;

    }
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }
    public void drawBlood(Patient sickPatient) {
        sickPatient.drawBlood(5);
    }
    public int calculatePay() {
        return 80000;
    }
}
