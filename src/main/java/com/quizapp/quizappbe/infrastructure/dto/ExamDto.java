package com.quizapp.quizappbe.infrastructure.dto;

import java.util.Date;

public class ExamDto {

    private Date date;

    private Float grade;

    private String user;

    private String testSubject;

    public Date getDate() {
        return date;
    }

    public ExamDto setDate(Date date) {
        this.date = date;
        return this;
    }

    public Float getGrade() {
        return grade;
    }

    public ExamDto setGrade(Float grade) {
        this.grade = grade;
        return this;
    }

    public String getUser() {
        return user;
    }

    public ExamDto setUser(String user) {
        this.user = user;
        return this;
    }

    public String getTestSubject() {
        return testSubject;
    }

    public ExamDto setTestSubject(String testSubject) {
        this.testSubject = testSubject;
        return this;
    }
}
