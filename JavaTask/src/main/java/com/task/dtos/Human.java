package com.task.dtos;

public class Human {
    Client client;

    public Human(Client client){
        this.client = client;
    }

    public Client getClient(){
        return client;
    }
}
