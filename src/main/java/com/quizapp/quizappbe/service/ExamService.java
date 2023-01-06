package com.quizapp.quizappbe.service;


import com.quizapp.quizappbe.infrastructure.dto.ExamDto;
import com.quizapp.quizappbe.mapper.ExamMapper;
import com.quizapp.quizappbe.persistance.model.Exam;
import com.quizapp.quizappbe.persistance.repository.ExamRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExamService {

    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private ExamRepository examRepository;

    public List<ExamDto> getAllExams(){
        return examRepository.findAll().stream().map(ExamMapper::createExamDto).collect(Collectors.toList());
    }

    public Exam addExam(ExamDto examDto){
        return examRepository.save(ExamMapper.createExam(examDto));
    }


}
