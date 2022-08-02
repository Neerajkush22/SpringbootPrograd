package com.OptionalCrudOperation.Hospital.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PatientDetials")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String patientName;
    @Column
    private int age;
    @Column
    private long phoneNo;
    @Column
    private String disease;
    @Column
    private String sessionDate;
    @Column
    private String drName;
    @Column
    private String address;

}
