package az.company.schoolmanageapp.model.request;

import lombok.Data;


@Data
public class StudentRequestModel {
    private String name;
    private String surname;
    private Integer course;
    private Integer grade;
    private SpecializationRequestModel speciality;
    private Integer absentCount;
}