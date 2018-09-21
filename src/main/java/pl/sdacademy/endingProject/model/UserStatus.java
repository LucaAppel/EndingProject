package pl.sdacademy.endingProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    public UserStatus() {
    }

    public UserStatus(User user, RoleEnum role) {
        this.user = user;
        this.role = role;
    }

    public UserStatus(User user, RoleEnum role, Universum universum) {
        this.user = user;
        this.role = role;
        this.universum = universum;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    @JsonIgnore
    public Universum getUniversum() {
        return universum;
    }

    public void setUniversum(Universum universum) {
        this.universum = universum;
    }
}
