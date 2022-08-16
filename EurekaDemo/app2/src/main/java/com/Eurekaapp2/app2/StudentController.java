package com.Eurekaapp2.app2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class StudentController {

    @PostMapping("/student/save")
    public Student save(Student student)
    {
        student.setfName("Aakash");
        student.setlName("Kushwaha");
        return student;
    }
}