package com.quizapp.quizappbe.persistance.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "admin")
    Set<Test> testsCreatedList;

    public Integer getId() {
        return id;
    }

    public Admin setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Admin setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Admin setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Test> getTestsCreatedList() {
        return testsCreatedList;
    }

    public Admin setTestsCreatedList(Set<Test> testsCreatedList) {
        this.testsCreatedList = testsCreatedList;
        return this;
    }
}