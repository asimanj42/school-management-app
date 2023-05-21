package model.dto;

import az.company.schoolmanageapp.entity.Specialization;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

@Data
public class StudentsDto {
    Integer id;
    String name;
    String surname;
    int course;
    int absentCount;
    SpecializationDto specialityId;
}