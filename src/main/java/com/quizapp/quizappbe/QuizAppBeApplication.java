package com.quizapp.quizappbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
        "com.quizapp.quizappbe"})
public class QuizAppBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizAppBeApplication.class, args);
    }

}
