package com.OptionalCrudOperation.Hospital.Controller;

import com.OptionalCrudOperation.Hospital.Model.Hospital;
import com.OptionalCrudOperation.Hospital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Hospital")
public class HospitalController {
    @Autowired
    private PatientService patientService;
    public HospitalController(PatientService patientService)
    {
        this.patientService=patientService;
    }
    @PostMapping
    public ResponseEntity<Hospital>savePatient(@RequestBody Hospital hospital)
    {
        return new ResponseEntity<Hospital>(patientService.savePatient(hospital), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Hospital>getAllPatient()
    {
        return patientService.getAllPatient();
    }
    @GetMapping("{id}")
    public ResponseEntity<Hospital>getPatientById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Hospital>(patientService.getPatientById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Hospital> updatePatient(@PathVariable("id")int id,@RequestBody Hospital hospital)
    {
        return new ResponseEntity<Hospital>(patientService.updatePatient(hospital,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    private ResponseEntity<String> deletePatient(@PathVariable("id")int id)
    {
        patientService.deletePatient(id);
        return new ResponseEntity<String>("Patient has been deleted",HttpStatus.OK);
    }

}