package com.teem1.backend.solution.controller;

import com.teem1.backend.solution.dto.SolutionResultInfo;
import com.teem1.backend.solution.dto.SolveInfo;
import com.teem1.backend.solution.service.SolutionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class SolutionResultController {

    private SolutionResultService solutionResultService;

    @Autowired
    SolutionResultController(SolutionResultService solutionResultService)
    {
        this.solutionResultService = solutionResultService;
    }

    @PostMapping("/solve")
    SolutionResultInfo solve(@RequestBody  SolveInfo solveInfo)
    {
        return solutionResultService.solve(solveInfo);
    }

}
