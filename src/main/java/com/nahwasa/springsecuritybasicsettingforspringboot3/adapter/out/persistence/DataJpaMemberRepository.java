package com.nahwasa.springsecuritybasicsettingforspringboot3.adapter.out.persistence;

import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DataJpaMemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUserid(String userId);
}
