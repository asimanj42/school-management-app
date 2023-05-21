package model.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

@Data
public class GradesDto{
    Integer id;
    Integer activity;
    Integer quiz;
    Integer participation;
    Integer midterm;
    Integer final1;
    Integer avarage;
    LessonsDto lessonId;
    StudentsDto studentId;
}