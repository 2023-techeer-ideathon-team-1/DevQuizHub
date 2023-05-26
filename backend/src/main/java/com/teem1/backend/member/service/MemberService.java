package com.teem1.backend.member.service;

import com.teem1.backend.constant.Grade;
import com.teem1.backend.member.dto.LoginDto;
import com.teem1.backend.member.dto.MemberDto;
import com.teem1.backend.member.dto.SignUpDto;
import com.teem1.backend.member.entity.Member;
import com.teem1.backend.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    @Autowired
    MemberService(MemberRepository memberRepository)
    {
        this.memberRepository = memberRepository;
    }

    public List<MemberDto> all()
    {
        List<Member> list =  memberRepository.findAll();

        ArrayList<MemberDto> resultDto = new ArrayList<>();

        list.forEach(
                x-> resultDto.add(new MemberDto(x.email,x.password,x.nickname,x.grade))
        );

        return resultDto;
    }

    public void signUp(SignUpDto sign)
    {
        Member member = Member.builder().
                email(sign.email).password(sign.password).nickname(sign.nickname).grade(Grade.BRONZE).build();

        memberRepository.save(member);
    }

    public boolean login(LoginDto loginDto)
    {
        Optional<Member> member = memberRepository.findByEmail(loginDto.getEmail());

        if(!member.isPresent())
        {
            return false;
        }

        else{
            Member memberDetail = member.get();

            if(memberDetail.password.equals(loginDto.getPassword()))
            {
                return true;
            }

            return false;
        }
    }

    public void gradeUp(Long memberId,Grade grade)
    {
        Member member = memberRepository.findById(memberId).get();

        member.grade = grade;

        memberRepository.save(member);
    }

    public MemberDto getMember(Long memberId)
    {
        Optional<Member> member = memberRepository.findById(memberId);
        MemberDto result = new MemberDto();
        if(member.isPresent())
        {
            Member present = member.get();
            result.email = present.email;
            result.password = present.password;
            result.nickname = present.nickname;
            result.grade = present.grade;

        }

        return result;
    }

}
