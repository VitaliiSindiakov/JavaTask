package com.tests;

import com.task.dtos.User;
import com.task.dtos.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTask1Tests {
    List<Person> people = new ArrayList<>();
    List<String> expPersonNames = new ArrayList<>();

    @BeforeEach
    public void createHumanList() {
        people.add(new Person(new User("John", "Smith", 34)));
        people.add(new Person(new User("Adam", "Rees", 45)));
        people.add(new Person(new User("Alexander", "Allen", 18)));
        people.add(new Person(new User("Dominic", "Dominic", 16)));
        people.add(new Person(new User("John", "Smith", 34)));
        people.add(new Person(new User("Nick", "Jr", 51)));

        expPersonNames.add("John");
        expPersonNames.add("Alexander");
        expPersonNames.add("Dominic");
    }

    public List<String> getUserNames() {
        //1. Find all Users younger 34 (included)
        //2. Users with no Duplicates
        //3. Order by Age (from Older to Younger)
        //4. collect to Users by First Name

        //Put here solution
        return null;
    }



    @Test
    public void checkListPersons() {
        assertEquals(expPersonNames, getUserNames());

        //Print the list
    }
}