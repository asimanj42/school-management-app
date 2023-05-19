package az.company.schoolmanageapp.dto;

import az.company.schoolmanageapp.entity.Students;
import lombok.Data;

import java.io.Serializable;


@Data
public class StudentDto {
    private Integer id;
    private String name;
    private String surname;
    private Integer grade;
    private SpecializationDto speciality;
    private Integer absentCount;
}