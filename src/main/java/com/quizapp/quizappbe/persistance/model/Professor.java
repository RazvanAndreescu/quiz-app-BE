package com.quizapp.quizappbe.persistance.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "professors")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "professor")
    Set<Test> testsCreatedList;

    public Integer getId() {
        return id;
    }

    public Professor setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Professor setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Professor setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Professor setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Test> getTestsCreatedList() {
        return testsCreatedList;
    }

    public Professor setTestsCreatedList(Set<Test> testsCreatedList) {
        this.testsCreatedList = testsCreatedList;
        return this;
    }
}