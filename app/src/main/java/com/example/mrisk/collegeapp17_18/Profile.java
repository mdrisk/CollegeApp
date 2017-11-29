package com.example.mrisk.collegeapp17_18;

/**
 * Created by mrisk on 11/27/2017.
 */

public class Profile {
    String firstName;
    String lastName;

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
