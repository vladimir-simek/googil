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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWholeName(String wholeName) {
        this.wholeName = wholeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     public void editClient(String name, String surname, int age, String email, int phoneNumber){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
     }
}

