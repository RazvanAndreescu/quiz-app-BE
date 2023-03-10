package com.quizapp.quizappbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={
        "com.quizapp.quizappbe"})
public class QuizAppBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizAppBeApplication.class, args);
    }

}
