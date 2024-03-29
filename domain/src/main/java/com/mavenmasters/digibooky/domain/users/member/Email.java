package com.mavenmasters.digibooky.domain.users.member;

import com.mavenmasters.digibooky.domain.exceptions.InvalidEmailAddressException;

import java.util.Objects;

public class Email {
    private String email;

    public Email(String email) {
        if (!isValid(email)) {
            throw new InvalidEmailAddressException();
        }
        this.email = email;
    }

    private boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return Objects.equals(email, email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public String getEmail() {
        return email;
    }

}
