package sysc4806.graduatingteam.amazinbookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sysc4806.graduatingteam.amazinbookstore.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
