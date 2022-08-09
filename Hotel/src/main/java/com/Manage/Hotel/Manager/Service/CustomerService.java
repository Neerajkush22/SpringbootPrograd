package com.Manage.Hotel.Manager.Service;

import com.Manage.Hotel.Manager.Models.Hotel;

import java.util.List;

public interface CustomerService {
    Hotel saveCustomer(Hotel hotel);
    List<Hotel> getAllCustomer();
    Hotel getCustomerById(int id);
    Hotel updateCustomer(Hotel hotel,int id);
    void deleteCustomer(int id);
}
