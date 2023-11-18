package com.demo.wearway.repository;

import com.demo.wearway.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {



}
