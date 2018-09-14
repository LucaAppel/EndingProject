package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstNames;
    private String nickNames;
    private String lastName;
    private String familyName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    @ManyToMany (mappedBy = "attendees")
    private List<Event> events;
    @ManyToMany
    @JoinColumns({@JoinColumn(name = "person1", referencedColumnName = "person1"), @JoinColumn(name = "person2", referencedColumnName = "person2")})
    private List<Relation> relations;
    @ManyToOne
    private Universum universum;
}
