package com.demo.wearway.entity;

import com.demo.wearway.entity.enumerate.OrderStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Table(name = "order_total")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderTotal extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "total_price", nullable = false)
    private int totalPrice;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(length = 20)
    private String card;

    @Column(length = 10)
    @ColumnDefault("'ORDER'")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name = "refund_reason", length = 300)
    private String refundReason;

    @Column(nullable = false, length = 20)
    private String name; // 받는분 이름

    @Embedded
    @Column(nullable = false)
    private Address address; // 우편번호, 주소, 상세주소 포함

    @Column(nullable = false, length = 15)
    private String tel;

    @Column(length = 100)
    @ColumnDefault("'조심히 안전하게 와주세요.'")
    private String request;

    @Column(name = "item_cnt")
    private int itemCnt;

    @Column(name = "item_name", length = 150)
    private String itemName;

    @Column(name = "item_img", length = 600)
    private String itemImg;

}
