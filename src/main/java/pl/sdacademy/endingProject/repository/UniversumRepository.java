package pl.sdacademy.endingProject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.sdacademy.endingProject.model.Universum;
import pl.sdacademy.endingProject.model.User;

import java.util.Set;

public interface UniversumRepository extends CrudRepository<Universum,Integer> {
    @Query("SELECT u FROM Universum u INNER JOIN u.userStatusSet us WHERE us.user = :user")
    Set<Universum> findByUser(@Param("user") User user);
}
