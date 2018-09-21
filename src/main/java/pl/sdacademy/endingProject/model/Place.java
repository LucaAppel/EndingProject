package pl.sdacademy.endingProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String cityName;
    private String street;
    private String placeNumber;
    private String shortDescription;
    @ManyToMany
    private Set<Event> events = new HashSet<>();
    @ManyToOne
    private Universum universum;

    public Place() {
    }

    public Place(String name, String cityName, String street, String placeNumber, String shortDescription, Set<Event> events, Universum universum) {
        this.name = name;
        this.cityName = cityName;
        this.street = street;
        this.placeNumber = placeNumber;
        this.shortDescription = shortDescription;
        this.events = events;
        this.universum = universum;
    }

    public Place(String name, String cityName, String shortDescription) {
        this.name = name;
        this.cityName = cityName;
        this.shortDescription = shortDescription;
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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

    @JsonIgnore
    public Universum getUniversum() {
        return universum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (id != place.id) return false;
        if (name != null ? !name.equals(place.name) : place.name != null) return false;
        if (cityName != null ? !cityName.equals(place.cityName) : place.cityName != null) return false;
        if (street != null ? !street.equals(place.street) : place.street != null) return false;
        if (placeNumber != null ? !placeNumber.equals(place.placeNumber) : place.placeNumber != null) return false;
        if (shortDescription != null ? !shortDescription.equals(place.shortDescription) : place.shortDescription != null)
            return false;
        if (events != null ? !events.equals(place.events) : place.events != null) return false;
        return universum != null ? universum.equals(place.universum) : place.universum == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (placeNumber != null ? placeNumber.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (events != null ? events.hashCode() : 0);
        result = 31 * result + (universum != null ? universum.hashCode() : 0);
        return result;
    }
}
