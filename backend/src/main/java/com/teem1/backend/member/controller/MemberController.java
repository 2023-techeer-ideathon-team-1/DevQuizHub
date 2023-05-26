package com.teem1.backend.member.controller;

import com.teem1.backend.member.dto.GradeDto;
import com.teem1.backend.member.dto.LoginDto;
import com.teem1.backend.member.dto.MemberDto;
import com.teem1.backend.member.dto.SignUpDto;
import com.teem1.backend.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    private MemberService memberService;

    @Autowired
    MemberController(MemberService memberService)
    {
        this.memberService = memberService;
    }

    @PostMapping("/sign/up")
    public void signUp(@RequestBody  SignUpDto sign)
    {
        memberService.signUp(sign);
    }

    @PostMapping("/sign/in")
    public boolean signIn(@RequestBody LoginDto loginDto)
    {
        return memberService.login(loginDto);
    }

    @PostMapping("/grade/up")
    public void gradeUp(@RequestBody GradeDto gradeDto)
    {
        memberService.gradeUp(gradeDto.getMemberId(), gradeDto.getGrade());
    }

    @GetMapping("/all")
    public List<MemberDto> all()
    {
        return memberService.all();
    }

    @GetMapping("/get/{id}")
    public MemberDto getMember(@PathVariable Long id)
    {
        return memberService.getMember(id);
    }
}
