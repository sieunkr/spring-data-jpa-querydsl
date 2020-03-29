package com.example.demo.repository;

import com.example.demo.entity.Coffee;

import java.util.List;

public interface CoffeeCustomRepository {
    List<Coffee> findLimitByPrice(Long price);
}
