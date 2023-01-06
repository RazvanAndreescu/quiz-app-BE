package com.quizapp.quizappbe.mapper;

import com.quizapp.quizappbe.infrastructure.dto.ExamDto;
import com.quizapp.quizappbe.persistance.model.Exam;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class ExamMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static ExamDto createExamDto(Exam exam){
        mapExamDtoEntityFields();
        return modelMapper.map(exam, ExamDto.class);
    }

    public static Exam createExam(ExamDto examDto){
        return modelMapper.map(examDto, Exam.class);
    }

    private static void mapExamDtoEntityFields(){
        TypeMap<Exam, ExamDto> propertyMapper = modelMapper.getTypeMap(Exam.class, ExamDto.class);

        if (propertyMapper==null){
            propertyMapper = modelMapper.createTypeMap(Exam.class, ExamDto.class);
        }

        propertyMapper.addMappings(mapper -> mapper.map(src -> src.getStudent().getUsername(), ExamDto::setUser));
        propertyMapper.addMappings(mapper -> mapper.map(src -> src.getTest().getSubject(), ExamDto::setTestSubject));
    }

}
