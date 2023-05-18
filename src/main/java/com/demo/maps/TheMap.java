package com.demo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    //Map with objects:
    Rol admin = new Rol("admin");
    Rol sysAdmin = new Rol("sysAdmin");
    Rol manager = new Rol("manager");
    Rol admin2 = new Rol("admin"); //Not allowed two admin -> its necessary override hashCode and equals methods.

    System.out.println(admin.equals(admin2)); // --> true

    Map<Rol, Person> employees = new HashMap<>();
    employees.put(admin, new Person("daniel"));
    employees.put(sysAdmin, new Person("marian"));
    employees.put(manager, new Person("oscar"));
    employees.put(admin2, new Person("carl"));

    System.out.println();
    System.out.println(employees);

  }

  record Person(String name) {}

  static class Rol {
    String name;

    public Rol(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Rol rol = (Rol) o;

      return Objects.equals(name, rol.name);
    }

    @Override
    public int hashCode() {
      return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
      return "Rol{" +
        "name='" + name + '\'' +
        '}';
    }
  }

}
