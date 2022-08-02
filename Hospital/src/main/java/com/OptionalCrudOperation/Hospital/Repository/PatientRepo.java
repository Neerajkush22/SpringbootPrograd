package com.OptionalCrudOperation.Hospital.Repository;

import com.OptionalCrudOperation.Hospital.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Hospital,Integer> {
}
