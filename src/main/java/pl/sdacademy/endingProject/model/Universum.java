package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Universum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User owner;

    @OneToMany
    private List<UserStatus> userStatusList;

    @OneToMany
    private List<Person> personList;
    @OneToMany
    private List<Place> placeList;
    @OneToMany
    private List<Event> eventList;

    private Boolean isPrivate;

}
