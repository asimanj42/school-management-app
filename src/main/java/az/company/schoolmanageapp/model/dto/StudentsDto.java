package az.company.schoolmanageapp.model.dto;

import lombok.Data;

@Data
public class StudentsDto {
    Integer id;
    String name;
    String surname;
    int course;
    int absentCount;
    SpecializationDto specialityId;
}