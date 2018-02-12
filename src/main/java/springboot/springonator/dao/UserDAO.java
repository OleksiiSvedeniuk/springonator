package springboot.springonator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.springonator.entity.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
