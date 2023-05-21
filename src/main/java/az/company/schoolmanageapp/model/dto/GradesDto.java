package az.company.schoolmanageapp.model.dto;

import lombok.Data;

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