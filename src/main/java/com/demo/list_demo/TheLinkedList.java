package com.demo.list_demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {

  public static void main(String[] args) {

    LinkedList<String> names = new LinkedList<>();
    names.add("Alex");
    names.add("Carl");
    names.add("Anna");
    names.add("Marian");
    names.add("Robert");

    ListIterator<String> namesIterator = names.listIterator();
    while (namesIterator.hasNext()) {
      System.out.println(namesIterator.next());
    }
    System.out.println();
    while (namesIterator.hasPrevious()) {
      System.out.println(namesIterator.previous());
    }
  }
}
