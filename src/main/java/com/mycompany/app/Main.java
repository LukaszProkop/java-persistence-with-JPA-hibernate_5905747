package com.mycompany.app;

import com.mycompany.app.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("library_persistence_unit");
    EntityManager manager = factory.createEntityManager();

    manager.getTransaction().begin();

    Book book = new Book();
    book.setName("my book");
    book.setIsbn("123-456");

    manager.persist(book);
    manager.getTransaction().commit();
  }
}