package com.Employees.Data;

public class EmployeeDetail {
    private String firstName, lastName;
    private int age,salary;

    public EmployeeDetail(String firstName,String lastName,int age,int salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public int getSalary(){
        return this.salary;
    }


}

