package com.mycompany.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
//    /*
//     * EntityManagerFactory emf = new HibernatePersistenceProvider()
//     * .createContainerEntityManagerFactory(new DemoPersistenceUnitInfo(), new
//     * HashMap<>());
//     *
//     * EntityManager em = emf.createEntityManager(); // Represent the persistence
//     * context
//     */
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("library_persistence_unit");
    EntityManager manager = factory.createEntityManager();
  }
}