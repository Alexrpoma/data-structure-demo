package com.demo.maps;

import java.util.HashSet;
import java.util.Set;

public class TheHashCodeEquals {
  public static void main(String[] args) {

    Book book0 = new Book("Book0", "alex", 123);
    Book book1 = new Book("Book1", "carl", 456);
    Book book2 = new Book("Book2", "marian", 853);
    Book book3 = new Book("Book3", "ali", 123);

    Set<Book> books = new HashSet<>(); //Set not allow duplicate elements, in this case, if the ISBN of the two books are equals, set not allowed
    books.add(book0);
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.forEach(System.out::println);

    System.out.println(book0.equals(book1)); //Verify if ISBN is equals
  }

  static class Book {

    private final String title;
    private final String author;
    private final int ISBN;

    public Book (String title, String author, int ISBN) {
      this.title = title;
      this.author = author;
      this.ISBN = ISBN;
    }

    public void showBook() {
      System.out.printf("Book: %s author: %s ISBN: %d", title, author, ISBN);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Book book = (Book) o;

      return ISBN == book.ISBN;
    }

    @Override
    public int hashCode() {
      return ISBN;
    }

    @Override
    public String toString() {
      return "Book {" +
        "title ='" + title + '\'' +
        ", author ='" + author + '\'' +
        ", ISBN =" + ISBN +
        '}';
    }
  }
}
