package com.googil.crm.Logic;

import com.googil.crm.Data.Client;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Contacts {

    private ArrayList<Client> clients = new ArrayList<>();

    private void createClient(String name, String surname, int age, String email, int phoneNumber){
        clients.add(new Client(name, surname, age, email, phoneNumber));

    }

    private void removeClient(String email){
        clients = new ArrayList<>(clients
                .stream()
                .filter(i -> !i.getEmail().equals(email))
                .collect(Collectors.toList()));

    }

    private void editClient(){
        //Edit a client
    }
}
