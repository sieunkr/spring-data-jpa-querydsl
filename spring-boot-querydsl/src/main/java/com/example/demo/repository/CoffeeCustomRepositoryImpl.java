package com.example.demo.repository;

import com.example.demo.entity.Coffee;
import com.example.demo.entity.QCoffee;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class CoffeeCustomRepositoryImpl extends QuerydslRepositorySupport implements CoffeeCustomRepository {

    public CoffeeCustomRepositoryImpl() {
        super(Coffee.class);
    }

    @Override
    public List<Coffee> findLimitByPrice(Long price) {
        final QCoffee coffee = QCoffee.coffee;
        return from(coffee)
                .where(coffee.price.between(0, price))
                .fetch();
    }
}