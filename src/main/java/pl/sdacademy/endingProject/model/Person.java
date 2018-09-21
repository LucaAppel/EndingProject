package pl.sdacademy.endingProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstNames;
    private String nickNames;
    private String lastName;
    private String familyName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    @ManyToMany (mappedBy = "attendees")
    private Set<Event> events = new HashSet<>();
    @ManyToMany
    @JoinColumns({@JoinColumn(name = "person1", referencedColumnName = "person1"), @JoinColumn(name = "person2", referencedColumnName = "person2")})
    private Set<Relation> relations = new HashSet<>();
    @ManyToOne
    private Universum universum;

    public Person() {
    }

    public Person(String firstNames, String nickNames, String lastName, String familyName, Gender gender, LocalDate dateOfBirth, LocalDate dateOfDeath, Set<Event> events, Set<Relation> relations, Universum universum) {
        this.firstNames = firstNames;
        this.nickNames = nickNames;
        this.lastName = lastName;
        this.familyName = familyName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.events = events;
        this.relations = relations;
        this.universum = universum;
    }

    public Person(String firstNames, String lastName, String familyName, Gender gender, LocalDate dateOfBirth) {
        this.firstNames = firstNames;
        this.lastName = lastName;
        this.familyName = familyName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }


    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getNickNames() {
        return nickNames;
    }

    public void setNickNames(String nickNames) {
        this.nickNames = nickNames;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public void addEvent(Event event){
        this.events.add(event);
    }

    public Set<Relation> getRelations() {
        return relations;
    }

    public void setRelations(Set<Relation> relations) {
        this.relations = relations;
    }

    public void addRelation(Relation relation){
        this.relations.add(relation);
    }

    @JsonIgnore
    public Universum getUniversum() {
        return universum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (firstNames != null ? !firstNames.equals(person.firstNames) : person.firstNames != null) return false;
        if (nickNames != null ? !nickNames.equals(person.nickNames) : person.nickNames != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (familyName != null ? !familyName.equals(person.familyName) : person.familyName != null) return false;
        if (gender != person.gender) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(person.dateOfBirth) : person.dateOfBirth != null) return false;
        if (dateOfDeath != null ? !dateOfDeath.equals(person.dateOfDeath) : person.dateOfDeath != null) return false;
        if (events != null ? !events.equals(person.events) : person.events != null) return false;
        if (relations != null ? !relations.equals(person.relations) : person.relations != null) return false;
        return universum != null ? universum.equals(person.universum) : person.universum == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstNames != null ? firstNames.hashCode() : 0);
        result = 31 * result + (nickNames != null ? nickNames.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (dateOfDeath != null ? dateOfDeath.hashCode() : 0);
        result = 31 * result + (events != null ? events.hashCode() : 0);
        result = 31 * result + (relations != null ? relations.hashCode() : 0);
        result = 31 * result + (universum != null ? universum.hashCode() : 0);
        return result;
    }
}
