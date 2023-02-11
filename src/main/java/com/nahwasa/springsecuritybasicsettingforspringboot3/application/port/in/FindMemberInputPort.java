package com.nahwasa.springsecuritybasicsettingforspringboot3.application.port.in;

import com.nahwasa.springsecuritybasicsettingforspringboot3.application.port.out.MemberFindOutputPort;
import com.nahwasa.springsecuritybasicsettingforspringboot3.application.usecases.FindOneMemberUseCase;
import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindMemberInputPort implements FindOneMemberUseCase {
    private final MemberFindOutputPort memberFindOutputPort;

    public FindMemberInputPort(MemberFindOutputPort memberFindOutputPort) {
        this.memberFindOutputPort = memberFindOutputPort;
    }


    @Override
    public Optional<Member> findOne(String userId) {
        return memberFindOutputPort.findOne(userId);
    }
}
