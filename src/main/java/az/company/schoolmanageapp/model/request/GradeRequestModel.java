package az.company.schoolmanageapp.model.request;

import lombok.Data;


@Data
public class GradeRequestModel {
    private Integer id;
    private StudentRequestModel student;
    private LessonRequestModel lesson;
    private Integer activity;
    private Integer quiz;
    private Integer participation;
    private Integer midterm;
    private Integer finalField;
    private Integer avarage;
}