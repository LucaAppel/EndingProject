package pl.sdacademy.endingProject.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalDate endDate;
    private LocalTime endTime;
    @ManyToMany
    private Set<Person> attendees = new HashSet<>();
    private String headline;
    private String descryption;
    @ManyToMany(mappedBy = "events")
    private Set<Place> places = new HashSet<>();
    @ManyToOne
    private Universum universum;

    public Event() {
    }

    public Event(LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime, Set<Person> attendees, String headline, String descryption, Set<Place> places, Universum universum) {
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.attendees = attendees;
        this.headline = headline;
        this.descryption = descryption;
        this.places = places;
        this.universum = universum;
    }

    public Event(LocalDate startDate, String headline) {
        this.startDate = startDate;
        this.headline = headline;
    }

    public int getId() {
        return id;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Set<Person> getAttendees() {
        return attendees;
    }

    public void setAttendees(Set<Person> attendees) {
        this.attendees = attendees;
    }

    public void addAttendee(Person attendee){
        this.attendees.add(attendee);
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public void addPlace (Place place){
        this.places.add(place);
    }

    public Universum getUniversum() {
        return universum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (id != event.id) return false;
        if (startDate != null ? !startDate.equals(event.startDate) : event.startDate != null) return false;
        if (startTime != null ? !startTime.equals(event.startTime) : event.startTime != null) return false;
        if (endDate != null ? !endDate.equals(event.endDate) : event.endDate != null) return false;
        if (endTime != null ? !endTime.equals(event.endTime) : event.endTime != null) return false;
        if (attendees != null ? !attendees.equals(event.attendees) : event.attendees != null) return false;
        if (headline != null ? !headline.equals(event.headline) : event.headline != null) return false;
        if (descryption != null ? !descryption.equals(event.descryption) : event.descryption != null) return false;
        if (places != null ? !places.equals(event.places) : event.places != null) return false;
        return universum != null ? universum.equals(event.universum) : event.universum == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (attendees != null ? attendees.hashCode() : 0);
        result = 31 * result + (headline != null ? headline.hashCode() : 0);
        result = 31 * result + (descryption != null ? descryption.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (universum != null ? universum.hashCode() : 0);
        return result;
    }
}
