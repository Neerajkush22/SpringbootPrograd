package com.OptionalCrudOperation.Hospital.Service;

import com.OptionalCrudOperation.Hospital.Model.Hospital;

import java.util.List;

public interface PatientService {
    Hospital savePatient(Hospital hospital);
    List<Hospital>getAllPatient();
    Hospital getPatientById(int id);
    Hospital updatePatient(Hospital hospital,int id);
    void deletePatient(int id);
}
