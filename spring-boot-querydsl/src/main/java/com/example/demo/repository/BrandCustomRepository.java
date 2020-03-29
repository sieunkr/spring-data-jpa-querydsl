package com.example.demo.repository;

import com.example.demo.entity.Brand;

import java.util.List;

public interface BrandCustomRepository {
    List<Brand> findRecentlyRegistered();
}