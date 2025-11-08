package co.develhope.UnitTestV1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<co.develhope.UnitTestV1.User, Long> {
}