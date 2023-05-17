package com.demo.maps;

import java.util.HashMap;
import java.util.Map;

public class TheMap {

  public static void main(String[] args) {

    Map<Integer, Person> map = new HashMap<>();
    map.put(1, new Person("Anna"));
    map.put(2, new Person("Carl"));
    map.put(3, new Person("Paola"));
    map.put(4, new Person("Robert"));
    map.put(4, new Person("Robert")); //Duplicate key is not permit.

    System.out.println(map);

    System.out.println(map.keySet());
    System.out.println(map.entrySet());

    System.out.println(map.getOrDefault(6, new Person("Default")));

  }

  record Person(String name) {}

}
