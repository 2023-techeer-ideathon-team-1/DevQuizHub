package com.teem1.backend.solution.dto;

import com.teem1.backend.constant.Grade;
import com.teem1.backend.solution.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolutionDto {

    public String question;

    public String answer;

    @Enumerated(EnumType.STRING)
    public Category category;
}
