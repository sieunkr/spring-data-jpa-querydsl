package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "COFFEE")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRAND_ID", insertable = false, updatable = false)
    private Long brandId;

    @NotNull
    @Size(min = 1, max = 15, message = "")
    @Column(name = "COFFEE_NM")
    private String name;

    @Column(name = "PRICE")
    private Long price;

}
