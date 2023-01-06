package com.quizapp.quizappbe.controller;

import com.quizapp.quizappbe.infrastructure.dto.ExamDto;
import com.quizapp.quizappbe.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping(value = "/exams")
    public ResponseEntity getExams(){
        return ResponseEntity.ok(examService.getAllExams());
    }

    @PostMapping(value = "/exams")
    public ResponseEntity addExam(@RequestBody ExamDto examDto){
        return ResponseEntity.ok(examService.addExam(examDto));
    }

}
