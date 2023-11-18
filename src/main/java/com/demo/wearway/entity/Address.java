package com.demo.wearway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Address {

    @Column(nullable = false, length = 6)
    private String zipcode; // 우편번호

    @Column(nullable = false, length = 300)
    private String address; // 시 구 동 번지 or OO길 0

    @Column(nullable = false, length = 100)
    private String addressDetail; // 건물 동, 호수

    public Address(String zipcode, String address, String addressDetail) {
        this.zipcode = zipcode;
        this.address = address;
        this.addressDetail = addressDetail;
    }
}
