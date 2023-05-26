package com.teem1.backend.member.repository;

import com.teem1.backend.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    @Override
    Optional<Member> findById(Long aLong);

    Optional<Member> findByEmail(String email);
}
