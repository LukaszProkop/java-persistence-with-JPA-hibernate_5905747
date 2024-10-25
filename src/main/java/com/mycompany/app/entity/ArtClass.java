package com.mycompany.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "class")
public class ArtClass {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private int id;

    @Column(name = "class_name")
    private String className;

    @Column(name = "day_of_week")
    private String dayOfWeek;
}
