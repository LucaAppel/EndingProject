package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nickname;
    private String email;
    private String password;
    @ManyToMany
    private List<User> friends;

    @OneToMany
    private List<UserStatus> myStatuses;

    @OneToMany
    private List<Universum> universums;
}