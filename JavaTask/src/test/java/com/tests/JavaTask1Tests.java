package com.tests;

import com.task.dtos.Client;
import com.task.dtos.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTask1Tests {
    List<Human> humans = new ArrayList<>();
    List<String> expPersonNames = new ArrayList<>();

    @BeforeEach
    public void createHumanList() {
        humans.add(new Human(new Client("Nick", "Jr", 51)));
        humans.add(new Human(new Client("Dominic", "Dominic", 16)));
        humans.add(new Human(new Client("John", "Smith", 34)));
        humans.add(new Human(new Client("Alexander", "Allen", 18)));
        humans.add(new Human(new Client("Adam", "Rees", 45)));
        humans.add(new Human(new Client("John", "Smith", 34)));

        expPersonNames.add("John");
        expPersonNames.add("Alexander");
        expPersonNames.add("Dominic");
    }

    public List<String> getClientNames() {
        //1. Find Client younger 34 (included)
        //2. Clients with no Duplicates
        //3. Order by Age (from Older to Younger)
        //4. collect to Client by First Name

        //Put here solution
        return null;
    }



    @Test
    public void checkListPersons() {
        assertEquals(expPersonNames, getClientNames());

        //Print the list
    }
}