package com.example.challenge4_1;

public class Names {

    private final String firstName;
    private final String lastName;

    public Names(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
