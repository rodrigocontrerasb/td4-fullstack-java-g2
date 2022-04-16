package cl.desafiolatam.producerest.repositories;

import cl.desafiolatam.producerest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
