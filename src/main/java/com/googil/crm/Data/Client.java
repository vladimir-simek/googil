package com.googil.crm.Data;

public class Client {
    String name;
    String surname;
    String wholeName;
    int age;
    String email;
    int phoneNumber;

    public Client(String name, String surname, int age, String email, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wholeName = name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getWholeName() {
        return wholeName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}

