package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Table(name = "BRAND")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "브랜드 이름을 입력하세요")
    @Size(min = 1, max = 10, message = "")
    @Column(name = "BRAND_NM")
    private String name;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="BRAND_ID")
    private Collection<Coffee> coffees;




}
