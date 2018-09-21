package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Universum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    private User owner;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<UserStatus> userStatusSet = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "universum")
    private Set<Person> personSet = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "universum")
    private Set<Place> placeSet = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "universum")
    private Set<Event> eventSet = new HashSet<>();

    private Boolean isPrivate = true;

    public Universum() {
    }

    public Universum(User owner, Set<UserStatus> userStatusSet, Set<Person> personSet, Set<Place> placeSet, Set<Event> eventSet, Boolean isPrivate) {
        this.owner = owner;
        this.userStatusSet = userStatusSet;
        this.personSet = personSet;
        this.placeSet = placeSet;
        this.eventSet = eventSet;
        this.isPrivate = isPrivate;
    }

    public Universum(String Name, Boolean isPrivate) {
        this.name = name;
        this.isPrivate = isPrivate;
    }

    public Universum(String name, User owner, Boolean isPrivate) {
        this.name = name;
        this.owner = owner;
        this.isPrivate = isPrivate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public Set<UserStatus> getUserStatusSet() {
        return userStatusSet;
    }

    public void setUserStatusSet(Set<UserStatus> userStatusSet) {
        this.userStatusSet = userStatusSet;
    }

    public void addUserStatus(UserStatus userStatus){
        userStatus.setUniversum(this);
        this.userStatusSet.add(userStatus);
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    public void addPerson(Person person){
        this.personSet.add(person);
    }

    public Set<Place> getPlaceSet() {
        return placeSet;
    }

    public void setPlaceSet(Set<Place> placeSet) {
        this.placeSet = placeSet;
    }

    public void addPlace(Place place){
        this.placeSet.add(place);
    }

    public Set<Event> getEventSet() {
        return eventSet;
    }

    public void setEventSet(Set<Event> eventSet) {
        this.eventSet = eventSet;
    }

    public void addEvent(Event event){
        this.eventSet.add(event);
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Universum universum = (Universum) o;

        if (id != universum.id) return false;
        if (owner != null ? !owner.equals(universum.owner) : universum.owner != null) return false;
        if (userStatusSet != null ? !userStatusSet.equals(universum.userStatusSet) : universum.userStatusSet != null)
            return false;
        if (personSet != null ? !personSet.equals(universum.personSet) : universum.personSet != null) return false;
        if (placeSet != null ? !placeSet.equals(universum.placeSet) : universum.placeSet != null) return false;
        if (eventSet != null ? !eventSet.equals(universum.eventSet) : universum.eventSet != null) return false;
        return isPrivate != null ? isPrivate.equals(universum.isPrivate) : universum.isPrivate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (userStatusSet != null ? userStatusSet.hashCode() : 0);
        result = 31 * result + (personSet != null ? personSet.hashCode() : 0);
        result = 31 * result + (placeSet != null ? placeSet.hashCode() : 0);
        result = 31 * result + (eventSet != null ? eventSet.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        return result;
    }
}
