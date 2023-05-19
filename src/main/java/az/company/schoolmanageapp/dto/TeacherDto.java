package az.company.schoolmanageapp.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class TeacherDto {
    private Integer id;
    private String name;
    private String surname;
    private LessonDto lesson;
}