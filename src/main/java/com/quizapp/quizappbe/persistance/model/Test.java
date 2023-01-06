package com.quizapp.quizappbe.persistance.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "subject")
    private String subject;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "students_tests",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Student> users;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tests_questions",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id"))
    Set<Question> questions;

    @OneToMany(mappedBy = "test")
    Set<Exam> exams;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;


    public Integer getId() {
        return id;
    }

    public Test setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Test setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Set<Student> getUsers() {
        return users;
    }

    public Test setUsers(Set<Student> users) {
        this.users = users;
        return this;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public Test setQuestions(Set<Question> questions) {
        this.questions = questions;
        return this;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public Test setExams(Set<Exam> exams) {
        this.exams = exams;
        return this;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Test setProfessor(Professor professor) {
        this.professor = professor;
        return this;
    }
}
