package az.company.schoolmanageapp.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class LessonDto {
    private Integer id;
    private String name;
    private SpecializationDto specialitization;
}