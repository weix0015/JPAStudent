package dk.kea.jpastudentdat22c.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate bornDate;
    private LocalTime bornTime;

    public Student() {

    }

    public Student(String name, LocalDate bornDate, LocalTime bornTime) {
        this.name = name;
        this.bornDate = bornDate;
        this.bornTime = bornTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public LocalTime getBornTime() {
        return bornTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public void setBornTime(LocalTime bornTime) {
        this.bornTime = bornTime;
    }
}
