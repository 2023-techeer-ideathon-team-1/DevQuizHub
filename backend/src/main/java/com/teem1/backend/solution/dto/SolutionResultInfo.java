package com.teem1.backend.solution.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
public class SolutionResultInfo {
    private final Long memberId;

    private final Boolean isCorrect;

    private final Long solutionId;
}


