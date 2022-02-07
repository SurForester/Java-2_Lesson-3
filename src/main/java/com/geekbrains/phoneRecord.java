package com.geekbrains;

public class phoneRecord {

    private final String lastName;
    private final String phoneNumber;

    public phoneRecord(String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public boolean isLastName(String name) {
        return this.lastName.equals(name);
    }

    public String getPhone(){
        return this.phoneNumber;
    }
}
