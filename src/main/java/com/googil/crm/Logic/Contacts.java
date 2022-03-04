package com.googil.crm.Logic;

import com.googil.crm.Data.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Contacts {

    private static List<Client> clients = new ArrayList<>();

    private static void createClient(String name, String surname, int age, String email, int phoneNumber){
        clients.add(new Client(name, surname, age, email, phoneNumber));

    }

    private static void removeClient(String email){
        clients.removeIf(i -> i.getEmail().equals(email));

    }

    private static void editClient(String name, String surname, int age, String email, int phoneNumber){
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getEmail().equals(email)){
                clients.get(i).editClient(name, surname, age, email, phoneNumber);
            }
        }
    }
}
