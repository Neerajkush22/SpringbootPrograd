package com.example.Hospital.patients.Service;

import com.example.Hospital.patients.Model.Hospital;
import com.example.Hospital.patients.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImp implements EmpService{
    @Autowired
    private PatientRepo patientRepo;
    public EmpServiceImp(PatientRepo patientRepo)
    {
        this.patientRepo=patientRepo;
    }
    @Override
    public Hospital savePatient(Hospital hospital)
    {
        return patientRepo.save(hospital);
    }
    @Override
    public List<Hospital> getAllPatient()
    {
        return patientRepo.findAll();
    }
    @Override
    public Hospital getPatientById(int id)
    {
        return patientRepo.findById(id).orElseThrow();
    }
    @Override
    public Hospital updatePatient(Hospital hospital,int id)
    {
        Hospital existingPatient =patientRepo.findById(id).orElseThrow();
        existingPatient.setPatientName(hospital.getPatientName());
        existingPatient.setAge(hospital.getAge());
        existingPatient.setPhoneNo(hospital.getPhoneNo());
        existingPatient.setDisease(hospital.getDisease());
        existingPatient.setSessionDate(hospital.getSessionDate());
        existingPatient.setDrName(hospital.getDrName());
        existingPatient.setAddress(hospital.getAddress());
        return existingPatient;
    }
    @Override
    public void deletePatient(int id)
    {
        patientRepo.findById(id).orElseThrow();
        patientRepo.deleteById(id);
    }
}
