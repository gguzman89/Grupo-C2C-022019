package com.unq.ViandasYaGrupoC2C022019.util;

import com.unq.ViandasYaGrupoC2C022019.model.Client;

public class ClientBuilder {

    public static ClientBuilder aClient() {
        return new ClientBuilder();
    }

    private String name = "no name";
    private String surname = "no surname";
    private String email = "no email";
    private int phone = 151515;
    private String locality = "no locality";
    private String address = "no address";

    public Client build() {
        Client aClient = new Client(name, surname, email, phone, locality, address);
        return aClient;
    }

    public ClientBuilder withName(String aName) {
        this.name = aName;
        return this;
    }
    
    
}