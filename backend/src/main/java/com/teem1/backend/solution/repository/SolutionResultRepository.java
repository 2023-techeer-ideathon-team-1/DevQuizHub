package com.teem1.backend.solution.repository;

import com.teem1.backend.member.entity.Member;
import com.teem1.backend.solution.entity.Solution;
import com.teem1.backend.solution.entity.SolutionResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SolutionResultRepository extends JpaRepository<SolutionResult, Long> {
    Optional<SolutionResult> findById(Long id);

    Optional<SolutionResult> findSolutionResultByIsCollectAndMember_id(Long id, Boolean isCollect, Member member_id);


}
