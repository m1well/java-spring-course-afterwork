package de.m1well.spring.course.entity;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.UUID;

public class GuestEntity {

    private UUID id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private DateTime timestampCreated;
    private DateTime timestampUpdated;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public DateTime getTimestampCreated() {
        return timestampCreated;
    }

    public void setTimestampCreated(DateTime timestampCreated) {
        this.timestampCreated = timestampCreated;
    }

    public DateTime getTimestampUpdated() {
        return timestampUpdated;
    }

    public void setTimestampUpdated(DateTime timestampUpdated) {
        this.timestampUpdated = timestampUpdated;
    }
}
