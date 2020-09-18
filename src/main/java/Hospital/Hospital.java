package Hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {


    Map<String, HospitalEmployee> employeeList = new HashMap<>();
    Map<Integer, Patient> patientList = new HashMap<>();
    public int patientID;
    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }
    public Collection<HospitalEmployee> getAllEmployees(){
        return employeeList.values();
    }
    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }
    public void admit(Patient patientToAdmit) {
        patientID++;
        patientList.put(patientID, patientToAdmit);
    }


    public HospitalEmployee findEmployee(String employeeNumber) {
        return employeeList.get(employeeNumber);
    }



    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for (HospitalEmployee employee: employeeList.values()) {
            if (employee instanceof MedicalDuties) {
                medicalEmployees.add(employee);
            }
        }
            return medicalEmployees;
        }


}



