package Hospital;



import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class DoctorTest {

    Doctor underTest = new Doctor("1", "name", "Specialty");
    Patient sickPatient = new Patient();


    @Test
    public void shouldIncreaseHealthLvlOfPatientFrom10To20WhenProvidingCare(){
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
    public void doctorShouldHaveSalaryOf120k(){
        int salary = underTest.calculatePay();
        assertEquals(120000, salary);
    }
}
