package com.teem1.backend.solution.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolveInfo {
    Long problemId;
    Long memberId;
    String memberAnswer;
}
