package com.mycompany.app;

import com.mycompany.app.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
      try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("artclass_persistence_unit");
           EntityManager em = emf.createEntityManager()) {

              em.getTransaction().begin();
              Student student = new Student();
              student.setName("John3");

              em.persist(student);
              em.getTransaction().commit();
      }
  }
}