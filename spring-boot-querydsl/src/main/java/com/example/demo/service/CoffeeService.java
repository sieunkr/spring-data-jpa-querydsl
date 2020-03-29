package com.example.demo.service;

import com.example.demo.entity.Coffee;
import com.example.demo.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> findLimitByPrice(Long price) {

        return coffeeRepository.findLimitByPrice(price);
    }
}