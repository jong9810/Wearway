package com.demo.wearway.entity;

import com.demo.wearway.entity.enumerate.YesOrNo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "member_address")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberAddress extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false)
    @Embedded
    private Address address;

    @Column(nullable = false, length = 15)
    private String tel;

    @Column(length = 100)
    @ColumnDefault("'조심히 안전하게 와주세요.'")
    private String request;

    @Column(name = "is_default", length = 1)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    private YesOrNo isDefault;
}
