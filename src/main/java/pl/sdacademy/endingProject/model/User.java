package pl.sdacademy.endingProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nickname;
    private String email;
    private String password;
    @ManyToMany
    private Set<User> friends = new HashSet<>();

    @OneToMany
    private Set<UserStatus> myStatuses = new HashSet<>();

    @OneToMany
    private Set<Universum> universums = new HashSet<>();

    public User() {
    }

    public User(String nickname, String email, String password, Set<User> friends, Set<UserStatus> myStatuses, Set<Universum> universums) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.friends = friends;
        this.myStatuses = myStatuses;
        this.universums = universums;
    }

    public User(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    public void addFriend(User friend){
        this.friends.add(friend);
    }

    public Set<UserStatus> getMyStatuses() {
        return myStatuses;
    }

    public void setMyStatuses(Set<UserStatus> myStatuses) {
        this.myStatuses = myStatuses;
    }

    public void addMyStatus(UserStatus status){
        this.myStatuses.add(status);
    }

    public Set<Universum> getUniversums() {
        return universums;
    }

    public void setUniversums(Set<Universum> universums) {
        this.universums = universums;
    }

    public void addUniversum(Universum uni){
        this.universums.add(uni);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (friends != null ? !friends.equals(user.friends) : user.friends != null) return false;
        if (myStatuses != null ? !myStatuses.equals(user.myStatuses) : user.myStatuses != null) return false;
        return universums != null ? universums.equals(user.universums) : user.universums == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        result = 31 * result + (myStatuses != null ? myStatuses.hashCode() : 0);
        result = 31 * result + (universums != null ? universums.hashCode() : 0);
        return result;
    }
}