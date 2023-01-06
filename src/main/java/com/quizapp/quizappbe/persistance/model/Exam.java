package com.quizapp.quizappbe.persistance.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date")
    private Date date;

    @Column(name = "grade")
    private Float grade;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    public Integer getId() {
        return id;
    }

    public Exam setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Exam setDate(Date date) {
        this.date = date;
        return this;
    }

    public Float getGrade() {
        return grade;
    }

    public Exam setGrade(Float grade) {
        this.grade = grade;
        return this;
    }

    public Student getStudent() {
        return student;
    }

    public Exam setStudent(Student student) {
        this.student = student;
        return this;
    }

    public Test getTest() {
        return test;
    }

    public Exam setTest(Test test) {
        this.test = test;
        return this;
    }
}
