package br.com.edson.batch.repository;

import br.com.edson.batch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
