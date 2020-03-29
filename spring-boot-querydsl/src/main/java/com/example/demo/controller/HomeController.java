package com.example.demo.controller;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Coffee;
import com.example.demo.repository.BrandRepository;
import com.example.demo.repository.CoffeeRepository;
import com.example.demo.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class HomeController {

    private final BrandRepository brandRepository;
    private final CoffeeService coffeeService;


    @GetMapping("/brand")
    public Brand findAll(@RequestParam("id") Long id) {
        return brandRepository.findById(id).get();
    }

    @GetMapping("/brands")
    public List<Brand> findAll() {
        return brandRepository.findRecentlyRegistered();
    }

    @GetMapping("/coffees")
    public List<Coffee> findAllCoffeeByLimitPrice() {
        return coffeeService.findLimitByPrice(1200L);
    }
}