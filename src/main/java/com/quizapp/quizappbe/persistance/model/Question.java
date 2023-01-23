package com.quizapp.quizappbe.persistance.model;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "question")
    private String question;

    @Column(name = "choice_1")
    private String choice1;

    @Column(name = "choice_2")
    private String choice2;

    @Column(name = "choice_3")
    private String choice3;

    @Column(name = "choice_4")
    private String choice4;

    @Column(name = "correct_choice")
    private String correctChoice;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tests_questions",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "test_id"))
    Set<Test> tests;

    public Integer getId() {
        return id;
    }

    public Question setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public Question setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getChoice1() {
        return choice1;
    }

    public Question setChoice1(String choice1) {
        this.choice1 = choice1;
        return this;
    }

    public String getChoice2() {
        return choice2;
    }

    public Question setChoice2(String choice2) {
        this.choice2 = choice2;
        return this;
    }

    public String getChoice3() {
        return choice3;
    }

    public Question setChoice3(String choice3) {
        this.choice3 = choice3;
        return this;
    }

    public String getChoice4() {
        return choice4;
    }

    public Question setChoice4(String choice4) {
        this.choice4 = choice4;
        return this;
    }

    public String getCorrectChoice() {
        return correctChoice;
    }

    public Question setCorrectChoice(String correctChoice) {
        this.correctChoice = correctChoice;
        return this;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public Question setTests(Set<Test> tests) {
        this.tests = tests;
        return this;
    }
}
