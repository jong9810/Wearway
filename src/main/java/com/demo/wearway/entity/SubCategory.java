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
    @Column(insertable=false, updatable=false)
    private Long sub_category_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sup_category_id")
    private SupCategory supCategory;

    @Column(nullable = false, length = 30)
    private String sub_name;

}
