package com.quizapp.quizappbe.persistance.repository;


import com.quizapp.quizappbe.persistance.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {
}
