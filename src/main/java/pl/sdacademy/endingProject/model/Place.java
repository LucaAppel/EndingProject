package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String cityName;
    private String street;
    private String placeNumber;
    private String shortDescription;
    @ManyToMany
    private List<Event> events;
    @ManyToOne
    private Universum universum;

}
