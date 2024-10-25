package com.mycompany.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("artclass_persistence_unit");
    EntityManager manager = factory.createEntityManager();
  }
}