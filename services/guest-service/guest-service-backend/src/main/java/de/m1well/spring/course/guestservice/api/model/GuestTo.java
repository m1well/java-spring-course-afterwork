package de.m1well.spring.course.guestservice.api.model;

import java.util.UUID;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
public class GuestTo {

    private UUID id;
    private String firstName;
    private String lastName;
    private String birthDate;

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}
