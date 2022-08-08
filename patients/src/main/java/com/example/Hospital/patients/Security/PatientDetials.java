package com.example.Hospital.patients.Security;

import com.example.Hospital.patients.Model.Hospital;
import com.example.Hospital.patients.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class PatientDetials implements UserDetailsService {
    @Autowired
    private PatientRepo patientRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hospital hospital = this.patientRepo.findByEmail(username).orElseThrow();
        return hospital;
    }
}
