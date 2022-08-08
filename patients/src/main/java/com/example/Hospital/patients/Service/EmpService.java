package com.example.Hospital.patients.Service;

import com.example.Hospital.patients.Model.Hospital;

import java.util.List;

public interface EmpService {
    Hospital savePatient(Hospital hospital);
    List<Hospital> getAllPatient();
    Hospital getPatientById(int id);
    Hospital updatePatient(Hospital hospital,int id);
    void deletePatient(int id);
}
