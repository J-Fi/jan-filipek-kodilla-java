package com.kodilla.good.patterns.food2door.client;

public class Client {
    private String name;
    private String email;
    private int phoneNumber;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Client(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Client(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Client: " + "\"" + name + '\"';
    }
}
