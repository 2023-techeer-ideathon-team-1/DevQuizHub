package com.teem1.backend.solution.controller;

import com.teem1.backend.solution.dto.SolutionDto;
import com.teem1.backend.solution.entity.Category;
import com.teem1.backend.solution.service.SolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SolutionController {

    private final SolutionService solutionService;

    @PostMapping("/solution/create")
    public void create(@RequestBody SolutionDto solutionDto) {
        solutionService.save(solutionDto);
    }

    @GetMapping("/solution/get/{id}")
    public SolutionDto getSolution(@PathVariable Long id) { return solutionService.getSolution(id); }


    @PostMapping("/solution")
    public List<SolutionDto> getAll(@RequestBody Category category) { return solutionService.getAll(category); }

}
