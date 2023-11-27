package com.tests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTask2Tests {
    public Map<String, String> topping(Map<String, String> map) {
/*
    Given a map of food keys and topping values

    Modify and return the map as follows,
    if the key "ice cream" is present, set its value to "cherry".
    In all cases, set the key "bread" to have the value "butter".
 */
        return map;
    }

    @Test
    public void test1() {
        Map<String, String> map = new HashMap();
        map.put("ice cream", "peanuts");
        assertEquals(
                Map.of("bread", "butter", "ice cream", "cherry")
                , topping(map));
    }

    @Test
    public void test2() {
        Map<String, String> map = new HashMap();
        assertEquals(
                Map.of("bread", "butter")
                , topping(map));
    }

    @Test
    public void test3() {
        Map<String, String> map = new HashMap();
        map.put("bread", "jam");
        map.put("ice cream", "strawberries");
        map.put("salad", "oil");
        assertEquals(
                Map.of("bread", "butter", "ice cream", "cherry", "salad", "oil")
                , topping(map));
    }
}
