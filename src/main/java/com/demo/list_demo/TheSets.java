package com.demo.list_demo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * A collection that contains no duplicate elements
 * More formally, sets contain no pair of elements e1
 * and e2 such that e1.equals(e2),
 * and at most one null element.
 * As implied by its name, this interface models
 * that mathematical set abstraction.
 */
public class TheSets {

  public static void main(String[] args) {
    Set<Ball> balls = new HashSet<>();
    balls.add(new Ball("orange"));
    balls.add(new Ball("blue"));
    balls.add(new Ball("red"));
    balls.add(new Ball("red")); //The duplicate color is eliminating because the Balls is a record.
    System.out.println(balls); // Return with no order guarantee.

    Set<Integer> nums = new TreeSet<>();
    nums.add(50);
    nums.add(25);
    nums.add(30);
    nums.add(75);
    nums.add(10);
    System.out.println(nums); // Return ordered elements, but it's slow.

    Set<Students> students = new HashSet<>();
    students.add(new Students("Alex"));
    students.add(new Students("Carl"));
    students.add(new Students("Marian"));
    students.add(new Students("Alex")); // It's necessary to overwrite the hasCode and equals methods for to avoid this duplicated name.
    System.out.println(students);
  }

  record Ball(String color){}

  static class Students {
    String name;
    public Students(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Students students = (Students) o;

      return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
      return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
      return "Students{" +
        "name='" + name + '\'' +
        '}';
    }
  }
}
