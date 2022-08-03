package com.Hotel.Managment.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CustomerDetail")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String customerName;
    @Column
    private int age;
    @Column
    private long phoneNo;
    @Column
    private String nationality;
    @Column
    private String purpose;
    @Column
    private int days;
    @Column
    private String address;
    @Column
    private String idType;
    @Column
    private String idNo;

}
