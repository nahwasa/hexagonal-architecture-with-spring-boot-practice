package com.nahwasa.springsecuritybasicsettingforspringboot3.application.port.in;

import com.nahwasa.springsecuritybasicsettingforspringboot3.application.port.out.MemberJoinOutputPort;
import com.nahwasa.springsecuritybasicsettingforspringboot3.application.usecases.JoinMemberUseCase;
import org.springframework.stereotype.Service;

@Service
public class RegisterMemberInputPort implements JoinMemberUseCase {

    private final MemberJoinOutputPort memberJoinOutputPort;

    public RegisterMemberInputPort(MemberJoinOutputPort memberJoinOutputPort) {
        this.memberJoinOutputPort = memberJoinOutputPort;
    }

    @Override
    public void join(String userid, String pw) {
        memberJoinOutputPort.join(userid, pw);
    }
}
