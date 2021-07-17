package hello.hellospring.repository;
import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //optional 널 대신사용함
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 리포지토리 네가지 기능
}
