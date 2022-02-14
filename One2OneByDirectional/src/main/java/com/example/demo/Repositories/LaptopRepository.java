package com.example.demo.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Laptop;
 

 
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{
 
}