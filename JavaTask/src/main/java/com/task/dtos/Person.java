package com.task.dtos;

public class Person {
    User user;

    public Person(User user){
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}
