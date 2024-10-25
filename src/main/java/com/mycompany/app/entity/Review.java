package com.mycompany.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int id;

    @Column(name = "teacher_id")
    private int teacherId;

    private String comment;

    private int rating;
}
