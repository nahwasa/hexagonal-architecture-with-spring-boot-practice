package com.nahwasa.springsecuritybasicsettingforspringboot3.application.port.out;

public interface MemberJoinOutputPort {

    Long join(String userid, String pw);
}
