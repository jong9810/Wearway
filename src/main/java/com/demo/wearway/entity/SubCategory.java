package com.demo.wearway.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sub_category")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_category_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sup_category_id")
    private SupCategory supCategory;

    @Column(name = "sub_category_name", nullable = false, length = 30)
    private String name;

    public SubCategory(SupCategory supCategory, String name) {
        this.supCategory = supCategory;
        this.name = name;
    }
}
