package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalDate endDate;
    private LocalTime endTime;
    @ManyToMany
    private List<Person> attendees;
    private String headline;
    private String descryption;
    @ManyToMany(mappedBy = "events")
    private List<Place> places;
    @ManyToOne
    private Universum universum;
}
