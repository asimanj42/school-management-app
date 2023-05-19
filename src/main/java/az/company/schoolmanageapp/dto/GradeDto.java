package az.company.schoolmanageapp.dto;

import lombok.Data;


@Data
public class GradeDto {
    private Integer id;
    private StudentDto student;
    private LessonDto lesson;
    private Integer activity;
    private Integer quiz;
    private Integer participation;
    private Integer midterm;
    private Integer finalField;
    private Integer avarage;
}