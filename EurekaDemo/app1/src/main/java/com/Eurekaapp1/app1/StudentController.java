package com.Eurekaapp1.app1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentController {
    @Autowired
    RestClientServer restClientServer;

    @GetMapping("/student/send")
    public Student save()
    {
        Student student= new Student();
        student.setfName("Neeraj");
        student.setlName("Kushwaha");
        return restClientServer.save(student);
    }
}
