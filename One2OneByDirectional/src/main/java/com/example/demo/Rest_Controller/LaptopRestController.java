package com.example.demo.Rest_Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Laptop;
import com.example.demo.Services.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {
    @Autowired(required = true)
    private LaptopService laptopService;

    @GetMapping("/")
    public List<Laptop> findLaptop() {
        return laptopService.listLaptop();
    }

    @PostMapping("/")
    public Laptop storeLaptop(@RequestBody Laptop laptop) {
        return laptopService.saveLaptop(laptop);
    }
}