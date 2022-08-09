package com.Manage.Hotel.Manager.Service;


import com.Manage.Hotel.Manager.Models.Hotel;
import com.Manage.Hotel.Manager.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;
    public CustomerServiceImp(CustomerRepo customerRepo)
    {
        this.customerRepo=customerRepo;
    }
    @Override
    public Hotel saveCustomer(Hotel hotel)
    {
        return customerRepo.save(hotel);
    }
    @Override
    public List<Hotel> getAllCustomer()
    {
        return customerRepo.findAll();
    }
    @Override
    public Hotel getCustomerById(int id)
    {
        return customerRepo.findById(id).orElseThrow();
    }
    @Override
    public Hotel updateCustomer(Hotel hotel,int id)
    {
        Hotel existingCustomer =customerRepo.findById(id).orElseThrow();
        existingCustomer.setCustomerName(hotel.getCustomerName());
        existingCustomer.setAge(hotel.getAge());
        existingCustomer.setPhoneNo(hotel.getPhoneNo());
        existingCustomer.setNationality(hotel.getNationality());
        existingCustomer.setPurpose(hotel.getPurpose());
        existingCustomer.setDays(hotel.getDays());
        existingCustomer.setAddress(hotel.getAddress());
        existingCustomer.setIdType(hotel.getIdType());
        existingCustomer.setIdNo(hotel.getIdNo());
        return existingCustomer;
    }
    @Override
    public void deleteCustomer(int id)
    {
        customerRepo.findById(id).orElseThrow();
        customerRepo.deleteById(id);
    }
}