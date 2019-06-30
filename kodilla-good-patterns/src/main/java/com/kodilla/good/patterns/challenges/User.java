package com.kodilla.good.patterns.challenges;

public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int phoneNumber;

    public User (String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public User (String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getFirstName().equals(user.getFirstName())) return false;
        if (!getLastName().equals(user.getLastName())) return false;
        return getEmailAddress().equals(user.getEmailAddress());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getEmailAddress().hashCode();
        return result;
    }
}
