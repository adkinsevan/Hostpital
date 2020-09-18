package Hospital;



import org.testng.annotations.Test;

import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsInAnyOrder;

public class HospitalTest {

    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1", "DocOc", "limb enhancement");
    Nurse nurse = new Nurse("2", "nursename", 5);
    Janitor janitor = new Janitor("3", "janitorname", "burnward", true);

    @Test
    public void shouldBeAbleToHireADoctor() {
        underTest.hire(doctor);
        HospitalEmployee findDoctor = underTest.findEmployee("1");
        assertEquals("DocOc", findDoctor.getName());
    }

    @Test
    public void shouldBeAbleToHireAJanitorNurseAndDoctor() {
        underTest.hire(janitor);
        underTest.hire(nurse);
        underTest.hire((doctor));
        HospitalEmployee findDoctor = underTest.findEmployee("1");
        HospitalEmployee findNurse = underTest.findEmployee("2");
        HospitalEmployee findJanitor = underTest.findEmployee("3");
        assertEquals("DocOc", findDoctor.getName());
        assertEquals("nursename", findNurse.getName());
        assertEquals("janitorname", findJanitor.getName());
    }
//    @Test
//    public void shouldBeAbleToHireACollectionOfEmployees(){
//        underTest.hire(janitor);
//        underTest.hire(nurse);
//        underTest.hire((doctor));
//        Collection<HospitalEmployee> hiredEmployees =  underTest.getAllEmployees();
//        assertThat(hiredEmployees, containsInAnyOrder(doctor, nurse, janitor));
//    }
//@Test
//    public void shouldDisplayAllMedicalPersonnel(){
//    underTest.hire(janitor);
//    underTest.hire(nurse);
//    underTest.hire((doctor));
//    Collection<HospitalEmployee> medicalEmployees = underTest.getMedicalEmployees();
//    assertThat(medicalEmployees, containsInAnyOrder(doctor,nurse));
//}
//@Test
//    public void shouldAdmitTwoPatients(){
//        Patient sickPatient = new Patient();
//        Patient moreSickPatient = new Patient(5, 10);
//        underTest.admit(sickPatient);
//        underTest.admit(moreSickPatient);
//        Collection<Patient> admittedPatients = underTest.getAllPatients;
//        asassertThat(admittedPatients, containsInAnyOrder(sickPatient, moreSickPatient));
//}

}

