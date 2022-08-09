package com.Manage.Hotel.Manager.Controller;


import com.Manage.Hotel.Manager.Models.Hotel;
import com.Manage.Hotel.Manager.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Hotel")
public class HotelsController {
    @Autowired
    private CustomerService customerService;
    public HotelsController(CustomerService customerService)
    {
        this.customerService=customerService;
    }
    @PostMapping
    public ResponseEntity<Hotel>saveCustomer(@RequestBody Hotel hotel)
    {
        return new ResponseEntity<Hotel>(customerService.saveCustomer(hotel), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Hotel> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }
    @GetMapping("{id}")
    public ResponseEntity<Hotel>getCustomerById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Hotel>(customerService.getCustomerById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Hotel>updateCustomer(@PathVariable("id")int id,@RequestBody Hotel hotel)
    {
        return new ResponseEntity<Hotel>(customerService.updateCustomer(hotel,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id")int id)
    {
        customerService.deleteCustomer(id);
        return new ResponseEntity<String >("Customer has been deleted",HttpStatus.OK);
    }
}
