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
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

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

    @Column(name = "sale_percent")
    private int salePercent;

    @Column(name = "sale_price")
    private int salePrice; // 세일이 적용된 판매가

    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "is_deleted", length = 1)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    private YesOrNo isDeleted;

    public Product(SubCategory subCategory, String name, String img1, String content, int price, int stockQuantity) {
        this.subCategory = subCategory;
        this.name = name;
        this.img1 = img1;
        this.content = content;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void applySalePrice(int salePercent) {
        this.salePercent = salePercent;
        double salePercentDouble = (100 - salePercent) / 100.0;
        this.salePrice = (int) Math.round(this.price * salePercentDouble);
    }

    public void deleteProduct() {
        this.isDeleted = YesOrNo.Y;
    }
}
