package com.Hotel.Managment.Repository;

import com.Hotel.Managment.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Hotel,Integer> {
}
