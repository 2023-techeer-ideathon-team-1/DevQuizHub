package com.teem1.backend.solution.service;

import com.teem1.backend.solution.dto.SolutionResultInfo;
import com.teem1.backend.solution.entity.SolutionResult;
import com.teem1.backend.solution.repository.SolutionResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SolutionResultService {
    private final SolutionResultRepository solutionResultRepository;


}
