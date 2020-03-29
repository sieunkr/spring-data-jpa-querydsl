package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoffee is a Querydsl query type for Coffee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoffee extends EntityPathBase<Coffee> {

    private static final long serialVersionUID = -790371555L;

    public static final QCoffee coffee = new QCoffee("coffee");

    public final NumberPath<Long> brandId = createNumber("brandId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> price = createNumber("price", Long.class);

    public QCoffee(String variable) {
        super(Coffee.class, forVariable(variable));
    }

    public QCoffee(Path<? extends Coffee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoffee(PathMetadata metadata) {
        super(Coffee.class, metadata);
    }

}

