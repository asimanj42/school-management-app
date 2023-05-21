package az.company.schoolmanageapp.model.response;

import lombok.Data;


@Data
public class StudentResponseModel {
    private Integer id;
    private String name;
    private String surname;
    private Integer grade;
    private SpecializationResponseModel speciality;
    private Integer absentCount;
}