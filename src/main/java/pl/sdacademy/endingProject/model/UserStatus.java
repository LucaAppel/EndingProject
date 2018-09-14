package pl.sdacademy.endingProject.model;

import javax.persistence.*;

@Entity
public class UserStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;
    private RoleEnum role;

    @ManyToOne
    private Universum universum;
}
