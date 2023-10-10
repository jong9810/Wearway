package com.demo.wearway.entity;

import com.demo.wearway.entity.enumerate.YesOrNo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 600)
    private String img1;

    @Column(length = 1000)
    private String content;

    @Column(nullable = false)
    private int price; // 정가

    private int sale; // 세일이 적용된 판매가

    private LocalDateTime rdate;

    @Column(nullable = false)
    private int cnt;

    @Column(length = 1)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    private YesOrNo is_deleted;

}
