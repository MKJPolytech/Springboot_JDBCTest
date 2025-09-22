package kr.ac.kopo.mkj.springboot_jdbctest.repository;

import kr.ac.kopo.mkj.springboot_jdbctest.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
