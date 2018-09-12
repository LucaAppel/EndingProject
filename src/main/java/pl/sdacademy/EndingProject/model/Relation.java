package pl.sdacademy.EndingProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Relation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private RelationEnum relation;
    private Person person1;
    private Person person2;
    private LocalDate startTime;
    private LocalDate endTime;
}
