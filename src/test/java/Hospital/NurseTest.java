package Hospital;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("2", "name", 5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLvlFrom10To15WhenCaringForPatient() {
        underTest.careForPatient(sickPatient);
        int healthLvl = sickPatient.getHealthLvl();
        assertEquals(15, healthLvl);
    }

    @Test
    public void decreaseBloodLvlFrom20To15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int patientBloodLvl = sickPatient.getBloodLvl();
        assertEquals(15, patientBloodLvl);
    }
    @Test
    public void doctorShouldHaveSalaryOf80k(){
        int salary = underTest.calculatePay();
        assertEquals(80000, salary);
    }
}
