package Hospital;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SurgeonTest {
    Surgeon underTest = new Surgeon("1", "name", "specialty", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLvlOfPatientFrom10To20(){
        underTest.careForPatient(sickPatient);
        int healthLvl = sickPatient.getHealthLvl();
        assertEquals(20, healthLvl);
    }
    @Test
    public void decreaseBloodLvlFrom20To15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLvl = sickPatient.getBloodLvl();
        assertEquals(15, patientBloodLvl);
    }
    @Test
    public void doctorShouldHaveSalaryOf99k(){
        int salary = underTest.calculatePay();
        assertEquals(124000, salary);
    }
}