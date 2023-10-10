package com.demo.wearway.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sup_category")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SupCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable=false, updatable=false)
    private Long sup_category_id;

    @Column(nullable = false, length = 30)
    private String sup_name;

}
