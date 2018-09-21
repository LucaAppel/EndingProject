package pl.sdacademy.endingProject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sdacademy.endingProject.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
