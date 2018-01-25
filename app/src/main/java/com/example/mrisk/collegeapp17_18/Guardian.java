package com.example.mrisk.collegeapp17_18;

import java.io.Serializable;

/**
 * Created by mrisk on 11/27/2017.
 */

public class Guardian extends FamilyMember {


    String occupation;

    public Guardian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Guardian() {

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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}