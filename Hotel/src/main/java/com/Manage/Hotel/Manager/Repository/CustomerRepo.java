package com.Manage.Hotel.Manager.Repository;

import com.Manage.Hotel.Manager.Models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Hotel,Integer> {
    Optional<Hotel>findByEmail(String email);
}
