package com.elm.tajseer.tajseer;

import javax.persistence.*;

@Entity
@Table
public class student {
    @Id @GeneratedValue
    int id;
    @Column
    String numstd;
    @Column
    String grade;

    public student(int id, String numstd, String grade) {
        this.id = id;
        this.numstd = numstd;
        this.grade = grade;
    }

    public student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumstd() {
        return numstd;
    }

    public void setNumstd(String numstd) {
        this.numstd = numstd;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
