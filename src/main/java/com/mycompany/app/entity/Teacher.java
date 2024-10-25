package com.mycompany.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private int id;

    @Column(name = "teacher_name")
    private String name;
}
