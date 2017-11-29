package com.example.mrisk.collegeapp17_18;

/**
 * Created by mrisk on 11/29/2017.
 */

public class FamilyMember {
    String firstName;
    String lastName;

    public FamilyMember(){
        this.firstName = "Ada";
        this.lastName = "Lovelace";
    }

    public FamilyMember(String firstName, String lastName) {
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
