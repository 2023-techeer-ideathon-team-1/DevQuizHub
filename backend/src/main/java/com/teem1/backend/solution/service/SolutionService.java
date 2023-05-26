package com.teem1.backend.solution.service;

import com.teem1.backend.constant.Grade;
import com.teem1.backend.member.dto.MemberDto;
import com.teem1.backend.member.entity.Member;
import com.teem1.backend.member.repository.MemberRepository;
import com.teem1.backend.solution.dto.SolutionDto;
import com.teem1.backend.solution.entity.Category;
import com.teem1.backend.solution.entity.Solution;
import com.teem1.backend.solution.repository.SolutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SolutionService {
    private final SolutionRepository solutionRepository;

    public void save(SolutionDto solutionDto) {

        Solution solution = Solution.builder().
                question(solutionDto.getQuestion()).answer(solutionDto.getAnswer()).
                category(solutionDto.getCategory()).build();

        solutionRepository.save(solution);

    }

    public SolutionDto getSolution(Long solutionId) {

        Optional<Solution> solution = solutionRepository.findById(solutionId);
        SolutionDto result = new SolutionDto();
        if (solution.isPresent()) {
            Solution temp = solution.get();
            result.question = temp.getQuestion();
            result.answer = temp.getAnswer();
            result.category = temp.getCategory();
        }

        return result;
    }


    public List<SolutionDto> getAll(Category category) {

        List<Solution> solutionList = solutionRepository.findIdByCategory(category);

        ArrayList<SolutionDto> result = new ArrayList<>();

        solutionList.forEach(
                x -> result.add(new SolutionDto(x.getQuestion(), x.getAnswer(), x.getCategory()))
        );

        return result;
    }

}