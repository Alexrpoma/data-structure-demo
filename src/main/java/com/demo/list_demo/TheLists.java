package com.demo.list_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An ordered collection as a sequence
 * Allow duplicates
 * Not fixed in size like arrays
 * Fast for data retrievals
 * Various implementations
 * - ArrayList
 * - Stack
 * - Vector
 * - Others
 */
public class TheLists {

  public static void main(String[] args) {

    List things = new ArrayList();
    things.add("blue");
    things.add(10);
    things.add(new Object());
    System.out.println(things);

    List<String> colors = new ArrayList<>();
    colors.add("orange");
    colors.add("red");
    System.out.println(colors);

    List<String> colorsUnmodifiable = List.of("orange", "blue", "red"); //Returns an unmodifiable list containing three elements

  }
}
