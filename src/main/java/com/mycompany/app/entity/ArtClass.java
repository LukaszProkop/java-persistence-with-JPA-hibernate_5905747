package com.mycompany.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class ArtClass {

    @Id()
    private int id;
    private String className;
    private String dayOfWeek;
}
