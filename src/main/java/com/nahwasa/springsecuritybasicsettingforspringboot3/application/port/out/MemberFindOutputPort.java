package com.nahwasa.springsecuritybasicsettingforspringboot3.application.port.out;

import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;

import java.util.Optional;

public interface MemberFindOutputPort {

    Optional<Member> findOne(String userId);
}
