package pl.sdacademy.endingProject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sdacademy.endingProject.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
