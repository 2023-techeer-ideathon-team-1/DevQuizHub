package com.teem1.backend.member.entity;

import com.teem1.backend.constant.Grade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String email;

    public String password;

    public String nickname;

    @Enumerated(EnumType.STRING)
    public Grade grade;
}
