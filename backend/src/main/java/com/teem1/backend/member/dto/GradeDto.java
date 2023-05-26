package com.teem1.backend.member.dto;

import com.teem1.backend.constant.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeDto {
    Long memberId;

    @Enumerated(EnumType.STRING)
    Grade grade;
}
