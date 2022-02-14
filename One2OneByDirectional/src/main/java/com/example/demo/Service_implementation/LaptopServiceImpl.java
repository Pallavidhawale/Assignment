package com.example.demo.Service_implementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Laptop;
import com.example.demo.Repositories.LaptopRepository;
import com.example.demo.Services.LaptopService;
 
public class LaptopServiceImpl  implements LaptopService{

    @Autowired
    private LaptopRepository laptopRepository;
 
    public Laptop saveLaptop(Laptop laptop) {
        // TODO Auto-generated method stub
        return laptopRepository.save(laptop);
    }
 
    public List<Laptop> listLaptop() {
        // TODO Auto-generated method stub
        return laptopRepository.findAll();
    }
 
    public Laptop updateLaptop(Laptop laptop) {
        // TODO Auto-generated method stub
        return null;
    }
 
    public String deleteLaptop(Laptop laptop) {
        // TODO Auto-generated method stub
        return null;
    }
 
}