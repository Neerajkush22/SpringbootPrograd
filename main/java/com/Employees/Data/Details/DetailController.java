package com.Employees.Data.Details;

import com.Employees.Data.EmployeeDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
    @GetMapping("/Employee/{firstName}/{lastName}/{age}/{salary}")
    public EmployeeDetail employeeDetail(@PathVariable("firstName")String firstName,@PathVariable("lastName")String lastName,@PathVariable("age")int age,@PathVariable("salary")int salary)
    {
        return new EmployeeDetail(firstName, lastName, age, salary);
    }
}
