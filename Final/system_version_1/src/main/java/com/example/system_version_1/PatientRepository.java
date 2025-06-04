package com.example.system_version_1;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {

    List<Patient> getAll(){
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Rahim", 19, "MALE", "DHAKA", "Cardiology"));
        patients.add(new Patient("Rahul", 25, "MALE", "RAJSHAHI", "Skin"));
        patients.add(new Patient("Sadia", 30, "FEMALE", "KHULNA", "Gynaecology"));
        return patients;
    }
}
