package com.nahwasa.springsecuritybasicsettingforspringboot3.application.usecases;

import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;

import java.util.Optional;

public interface FindOneMemberUseCase {

    Optional<Member> findOne(String userId);
}