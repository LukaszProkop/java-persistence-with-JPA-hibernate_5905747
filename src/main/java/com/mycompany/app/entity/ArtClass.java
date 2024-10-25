package com.mycompany.app.entity;

import jakarta.persistence.*;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
