package org.example;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;

@JsonPropertyOrder({"lastname", "firstname", "phones", "addresses"})
public class Person {
    private String firstname;
    private String lastname;
    private String secondName;
    private ArrayList<PhoneInfo> phones;
    private ArrayList<String> addresses;

    public Person() {}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public ArrayList<PhoneInfo> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<PhoneInfo> phones) {
        this.phones = phones;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }
}
