package com.mavenmasters.digibooky.service.dto;

public class CreateMemberDto {

    private String inss;
    private String email;
    private String firstName;
    private String lastName;
    private String city;

    public String getInss() {
        return inss;
    }

    public CreateMemberDto setInss(String inss) {
        this.inss = inss;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateMemberDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateMemberDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CreateMemberDto setCity(String city) {
        this.city = city;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CreateMemberDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
}
