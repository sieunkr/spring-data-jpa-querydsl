package com.example.demo.repository;

import com.example.demo.entity.Brand;
import com.example.demo.entity.QBrand;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class BrandCustomRepositoryImpl extends QuerydslRepositorySupport implements BrandCustomRepository {

    public BrandCustomRepositoryImpl() {
        super(Brand.class);
    }

    public List<Brand> findRecentlyRegistered() {
        final QBrand brand = QBrand.brand;
        return from(brand)
                .orderBy(brand.id.desc())
                .fetch();
    }
}