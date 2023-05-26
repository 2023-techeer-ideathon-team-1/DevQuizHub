package com.teem1.backend.solution.service;

import com.teem1.backend.member.entity.Member;
import com.teem1.backend.member.repository.MemberRepository;
import com.teem1.backend.solution.dto.SolutionResultInfo;
import com.teem1.backend.solution.dto.SolveInfo;
import com.teem1.backend.solution.entity.Solution;
import com.teem1.backend.solution.entity.SolutionResult;
import com.teem1.backend.solution.repository.SolutionRepository;
import com.teem1.backend.solution.repository.SolutionResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class SolutionResultService {
    private final SolutionResultRepository solutionResultRepository;
    private final SolutionRepository solutionRepository;
    private final MemberRepository memberRepository;

    @Autowired
    SolutionResultService(SolutionResultRepository solutionResultRepository
    ,SolutionRepository solutionRepository,MemberRepository memberRepository)
    {
        this.solutionResultRepository = solutionResultRepository;
        this.solutionRepository = solutionRepository;
        this.memberRepository = memberRepository;
    }

    public SolutionResultService solve(Long SolveResultId)
    {
        SolutionResultService service = null;

        return service;
    }

}
