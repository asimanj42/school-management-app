package model.dto;

import az.company.schoolmanageapp.entity.Lessons;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;


@Data
public class TeacherDto {
    Integer id;
    String name;
    String surname;
    LessonsDto lessonId;
}