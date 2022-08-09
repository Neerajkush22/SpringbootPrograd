package com.Manage.Hotel.Manager.Security;

import com.Manage.Hotel.Manager.Models.Hotel;
import com.Manage.Hotel.Manager.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomerSecurity implements UserDetailsService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hotel hotel = this.customerRepo.findByEmail(username).orElseThrow();
        return hotel;
    }
}
