package model.response;

import lombok.Data;


@Data
public class GradeResponseModel {
    private Integer id;
    private StudentResponseModel student;
    private LessonResponseModel lesson;
    private Integer activity;
    private Integer quiz;
    private Integer participation;
    private Integer midterm;
    private Integer finalField;
    private Integer avarage;
}