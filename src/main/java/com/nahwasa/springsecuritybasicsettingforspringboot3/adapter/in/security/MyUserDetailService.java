package com.nahwasa.springsecuritybasicsettingforspringboot3.adapter.in.security;

import com.nahwasa.springsecuritybasicsettingforspringboot3.application.usecases.FindOneMemberUseCase;
import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyUserDetailService implements UserDetailsService {
    private final FindOneMemberUseCase findOneMemberUseCase;

    public MyUserDetailService(FindOneMemberUseCase findOneMemberUseCase) {
        this.findOneMemberUseCase = findOneMemberUseCase;
    }

    @Override
    public UserDetails loadUserByUsername(String insertedUserId) throws UsernameNotFoundException {
        Optional<Member> findOne = findOneMemberUseCase.findOne(insertedUserId);
        Member member = findOne.orElseThrow(() -> new UsernameNotFoundException("없는 회원입니다 ㅠ"));

        return User.builder()
                .username(member.getUserid())
                .password(member.getPw())
                .roles(member.getRoles())
                .build();
    }
}
