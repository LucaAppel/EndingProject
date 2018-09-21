package pl.sdacademy.endingProject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sdacademy.endingProject.model.Event;
import pl.sdacademy.endingProject.model.Person;

public interface EventRepository extends CrudRepository<Event,Integer> {
}
