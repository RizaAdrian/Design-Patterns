package com.pattern.adapter.service;

public class DeveloperServiceDBImpl implements DeveloperService {

    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String technology;

    public DeveloperServiceDBImpl(String id, String firstName, String lastName, String email, String technology) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.technology = technology;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getTechnology() {
        return null;
    }
}
