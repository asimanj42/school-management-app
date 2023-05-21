package az.company.schoolmanageapp.model.dto;

import lombok.Data;


@Data
public class TeacherDto {
    Integer id;
    String name;
    String surname;
    LessonsDto lessonId;
}