package com.example.Hospital.patients.Controller;

import com.example.Hospital.patients.Model.Hospital;
import com.example.Hospital.patients.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Hospital")
public class HospitalController {
    @Autowired
    private EmpService empService;
    public HospitalController(EmpService empService)
    {
        this.empService=empService;
    }
    @PostMapping
    public ResponseEntity<Hospital> savePatient(@RequestBody Hospital hospital)
    {
        return new ResponseEntity<Hospital>(empService.savePatient(hospital), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Hospital> getAllPatient()
    {
        return empService.getAllPatient();
    }
    @GetMapping("{id}")
    public ResponseEntity<Hospital>getPatientById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Hospital>(empService.getPatientById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Hospital> updatePatient(@PathVariable("id")int id,@RequestBody Hospital hospital)
    {
        return new ResponseEntity<Hospital>(empService.updatePatient(hospital,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    private ResponseEntity<String> deletePatient(@PathVariable("id")int id)
    {
        empService.deletePatient(id);
        return new ResponseEntity<String>("Patient has been deleted",HttpStatus.OK);
    }

}