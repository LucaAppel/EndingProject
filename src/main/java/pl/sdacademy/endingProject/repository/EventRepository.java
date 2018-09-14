package pl.sdacademy.endingProject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sdacademy.endingProject.model.Event;

public interface EventRepository extends CrudRepository<Event,Integer> {
}
