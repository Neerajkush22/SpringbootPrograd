package com.Hotel.Managment.Services;

import com.Hotel.Managment.Model.Hotel;

import java.util.List;

public interface CustomerService {
    Hotel saveCustomer(Hotel hotel);
    List<Hotel>getAllCustomer();
    Hotel getCustomerById(int id);
    Hotel updateCustomer(Hotel hotel,int id);
    void deleteCustomer(int id);
}
