package com.demo.lifo_fifo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * FIFO (First in - First out)
 * A collection designed for holding elements prior to processing.
 */
public class FIFO {

  public static void main(String[] args) {
    Queue<Person> supermarket = new LinkedList<>();
    supermarket.add(new Person("Alex", 25));
    supermarket.add(new Person("Anna", 18));
    supermarket.add(new Person("Mariam", 35));

    System.out.println(supermarket);
    System.out.println(supermarket.peek()); //Returns: the head of this queue, or null if this queue is empty

    supermarket.poll(); //Retrieves and removes the head of this queue, or returns null if this queue is empty.
    System.out.println(supermarket);
  }

  record Person(String name, int age){}
}
