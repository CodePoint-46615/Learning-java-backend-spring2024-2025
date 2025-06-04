package com.example.system_version_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PatientController {

    @GetMapping("/all")
    public List<Patient> getAllPatient(){
        PatientRepository patientRepository = new PatientRepository();
        return patientRepository.getAll();
    }

    @GetMapping("/age_filter")
    public List<Patient> patientFilter(){
        PatientRepository patientRepositoryFilter = new PatientRepository();
        return patientRepositoryFilter.getAll()
                .stream()
                .filter(patient -> patient.getAge() < 20 && patient.getDiseasesType() == "Cardiology")
                .collect(Collectors.toList());
    }
}
