package com.demo.wearway.entity;

import com.demo.wearway.entity.enumerate.Gender;
import com.demo.wearway.entity.enumerate.Role;
import com.demo.wearway.entity.enumerate.YesOrNo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false, length = 20)
    private String nick;

    @Column(nullable = false, length = 60)
    private String pw;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false, length = 15)
    private String tel;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(length = 13, nullable = false)
    private String jumin;

    @Column(length = 1, nullable = false)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    private Gender gender;

    @Column(name = "is_banned", length = 1)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    private YesOrNo isBanned;

    @Column(name = "is_signout", length = 1)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    private YesOrNo isSignout;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'USER'")
    private Role role;
}
