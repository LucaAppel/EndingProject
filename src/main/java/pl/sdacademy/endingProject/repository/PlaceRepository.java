package pl.sdacademy.endingProject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sdacademy.endingProject.model.Place;

public interface PlaceRepository extends CrudRepository<Place, Integer> {
}
