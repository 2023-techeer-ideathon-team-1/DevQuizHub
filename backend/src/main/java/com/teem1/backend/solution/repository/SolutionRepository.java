package com.teem1.backend.solution.repository;


import com.teem1.backend.member.entity.Member;
import com.teem1.backend.solution.entity.Solution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SolutionRepository extends JpaRepository<Solution, Long> {

    @Override
    Optional<Solution> findById(Long id);

    Optional<Solution> findIdByCategory(Long id);
}
