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
public class OrderTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(nullable = false)
    private int total_price;

    private LocalDateTime order_date;

    @Column(length = 20)
    private String card;

    @Column(length = 10)
    @ColumnDefault("'ORDER'")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(length = 300)
    private String refund_reason;

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

    private int item_cnt;

    @Column(length = 150)
    private String item_name;

    @Column(length = 600)
    private String item_img;

}
