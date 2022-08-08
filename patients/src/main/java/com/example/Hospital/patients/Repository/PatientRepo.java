package com.example.Hospital.patients.Repository;

import com.example.Hospital.patients.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<Hospital,Integer> {
    Optional<Hospital> findByEmail(String email);
}
