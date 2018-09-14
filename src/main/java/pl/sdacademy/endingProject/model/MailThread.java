package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MailThread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne
    private Person person1;
    @ManyToOne
    private Person person2;
    @OneToMany
    private List<Message> messages;
}
