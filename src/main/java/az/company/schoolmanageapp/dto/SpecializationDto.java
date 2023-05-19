package az.company.schoolmanageapp.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class SpecializationDto {
    private Integer id;
    private String specialityName;
    private List<LessonDto> lessonsList;
    private List<StudentDto> studentsList;
}