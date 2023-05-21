package az.company.schoolmanageapp.model.dto;

import lombok.Data;


@Data
public class ComplaintDto {
    Integer id;
    String complaintText;
    StudentsDto studentId;
    TeacherDto teacherId;
}