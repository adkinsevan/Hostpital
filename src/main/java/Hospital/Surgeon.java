package Hospital;

public class Surgeon extends Doctor {

    private boolean isOperating;

    public Surgeon(String employeeNumber, String name, String specialty, boolean isOperating) {
        super(employeeNumber, name, specialty);
        this.isOperating = isOperating;
    }
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }
    public int calculatePay() {
        return 124000;
    }
}