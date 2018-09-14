package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Relation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private RelationEnum relation;
    @ManyToOne
    @JoinColumn(name = "person1", referencedColumnName = "id")
    private Person person1;
    @ManyToOne
    @JoinColumn(name = "person2", referencedColumnName = "id")
    private Person person2;
    private LocalDate startTime;
    private LocalDate endTime;
}
